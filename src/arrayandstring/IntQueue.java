package arrayandstring;

public class IntQueue {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = -1;
    private int size;

    boolean isEmpty() {
        if(rear==-1) return true;
        return (size==0);


    }
    int size() {
        if(rear==-1) return 0;
        return size=(rear-front)+1;
    }
    void enqueue(int add) {
        //you add the element to position rear+1.
        if(rear+1<arr.length) {
            arr[rear+1]=add;
        }
        else {
            resize();
            arr[rear+1]=add;
        }
        rear++;
        if(front==-1) front++;
    }
    private void resize() {
        System.out.println("Resizing...");

        int[] newArray=new int[arr.length];

        System.arraycopy(arr,0,newArray, 0, newArray.length);


        arr=new int[newArray.length*2];
        System.arraycopy(newArray,0,arr, 0, newArray.length);



    }
    int dequeue() {
        //you remove the element in the position pointed to
        //by the variable front.
        if(front==-1) {  System.out.println("empty array cant remove");
            return 0;}

        int value= arr[front];

        int[] newArray=new int[arr.length];
        System.arraycopy(arr,front+1,newArray, 0, newArray.length-1);

        arr=new int[newArray.length];
        System.arraycopy(newArray,0,arr, 0, arr.length);
        rear--;
        return value;


    }

    int peek() {
        if(front==-1) {  System.out.println("empty array cant peek");
            return 0;
        }
        return arr[front];
    }

    @Override
    public String toString() {

        StringBuilder sb= new StringBuilder();
        for(int i=0;i<size;i++) {
            sb.append(arr[i]+"  ");
        }
        return sb.toString();

    }

    public static void main(String[] args) {

        IntQueue l = new IntQueue();

        l.dequeue();
        System.out.println("The Queue of size " + l.size() + " is " + l);
        l.peek();
        System.out.println("The Queue of size " + l.size() + " is " + l);
        l.enqueue(1);
        System.out.println("The Queue of size " + l.size() + " is " + l);

        l.enqueue(3);
        System.out.println("The Queue of size " + l.size() + " is " + l);
        l.enqueue(5);
        System.out.println("The Queue of size " + l.size() + " is " + l);
        l.enqueue(6);
        System.out.println("The Queue of size " + l.size() + " is " + l);
        l.enqueue(8);
        System.out.println("The Queue of size " + l.size() + " is " + l);
        System.out.println("deque element"+l.dequeue());
        System.out.println("The Queue of size " + l.size() + " is " + l);
        System.out.println("deque element"+l.dequeue());
        System.out.println("The Queue of size " + l.size() + " is " + l);

        l.enqueue(10);
        System.out.println("The Queue of size " + l.size() + " is " + l);
        l.enqueue(11);

        l.enqueue(10);
        l.enqueue(20);
        l.enqueue(30);
        l.enqueue(40);
        l.enqueue(50);
        l.enqueue(60);
        l.enqueue(70);
        l.enqueue(80);
        l.enqueue(100);
        System.out.println("The Queue of size " + l.size() + " is " + l);
        System.out.println(l.peek());
    }

}
