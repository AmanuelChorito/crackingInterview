package arrayandstring;

public class MyStringLinkedList {
    Node header;
    MyStringLinkedList(){
        header = new Node(null,null, null);
    }
    static int currentPosition=0;

    //inserts a new Node contain data so that its
    //position in the list is now pos
    void insert(String data, int pos) {
        Node newNode = new Node(data);

        if(pos<=0 ||( pos>1 && header.next==null)) return;


        if((header.next==null && pos==1 )|| (header.next!=null && pos==1)) {
            //fist insert
            newNode.next = header.next;

            newNode.previous=header;
            header.next = newNode;
            currentPosition++;

        }
        else if(pos==(currentPosition+1)) {

            Node current=header.next;

            while(current.next!=null) {

                current=current.next;
            }
            //last insert
            newNode.next=current.next;
            newNode.previous=current;
            current.next=newNode;
            currentPosition++;
        }
        else if(pos<currentPosition) {
            //middle insert
            Node current=header.next;
            int index=1;
            while(pos>index) {
                current=current.next;
                index++;
            }
            current=current.next;
            newNode.next=current;
            newNode.previous=current.previous;
            current.previous.next=newNode;
            current.previous=newNode;
            currentPosition++;
        }

        else {
            return;

        }


    }   //sort
    public void sort(){
        if(header.next == null ) return;
        Node current=header.next;
        int len = currentPosition;
        int temp = 0;
        for(int i = 1; i <= len; ++i){

            Node nextMinNode = minNode(current,i);
            swap(current,nextMinNode);
            current=current.next;
        }

    }
    //	which appears to switch the positions of n1 and n2 in the list with the following
    //	trick: it switches the values stored in the two nodes
    void swap(Node n1, Node n2){
        String temp = n1.value;
        n1.value =n2.value;
        n2.value = temp;

    }
    //which returns the Node nested in n that has the minimum value.
    public Node minNode(Node n, int position){
        String m =n.value;
        Node node = n;
        for(int i = position+1; i <= currentPosition; ++i){
            if((n.next.value.compareTo(m))<0){
                m =n.next.value;
                node=n.next;
            }
            n=n.next;
        }

        return node;
    }


    //attempts to remove the first Node that contains
    //data; if successful, returns true; otherwise, false.
    boolean remove(String data) {


        if(data == null) return false;
        Node current = header.next;
        Node previous = header;

        while(current != null) {
            if(data.equals(current.value)) {
                previous.next = current.next;
                current.next.previous=previous;
                currentPosition--;
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }

    void printNodes() {
        Node next = header.next;
        while(next != null) {
            System.out.print(next);
            next = next.next;

        }
        System.out.println();
    }


    class Node {
        String value;
        Node next;
        Node previous;
        Node(String value){
            this(null,null, value);
        }
        Node(Node next, Node previous, String value){
            this.next = next;
            this.previous = previous;
            this.value = value;
        }

        @Override
        public String toString() {
            return value + " ";
        }
    }


    public static void main(String[] args) {

        MyStringLinkedList sll = new MyStringLinkedList();
        //populate

        String[] stringData = {"big", "small", "tall", "short", "round", "square",
                "enormous", "tiny","gargantuan", "lilliputian",
                "numberless", "none", "vast", "miniscule"};


        for(int i =0; i<stringData.length; i++) {
            sll.insert(stringData[i],i+1);
        }



        sll.insert("Amar", 6); //end

        sll.insert("Aman",5);// middle
        sll.insert("Ema", 1);
        System.out.println(currentPosition);
        sll.printNodes();

        System.out.println(sll.remove("Billy"));
        System.out.println(currentPosition);
        sll.printNodes();
        sll.sort();
        sll.printNodes();
    }
}

