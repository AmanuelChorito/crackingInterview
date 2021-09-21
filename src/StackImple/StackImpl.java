package StackImple;

import java.util.Stack;

public class StackImpl {
    //
//    pop,push,sizeAtConstantTime,minAtConstantTime
//    How to make it thread safe: use lock
    private static final int MAX = 1000;
    private int[] stack = new int[MAX];
    private int[] minStack = new int[MAX];
    private int top, minTop;

    public StackImpl() {
        top = -1;
        minTop = -1;
        minStack[++top] = Integer.MAX_VALUE;
    }

    //isEmpty
    public boolean is_Empty() {
        return top < 0;
    }

    //pop
    public int pop() {
        if (is_Empty()) {
            System.out.println("Empty stack");
            return 0;
        } else {
            int x = this.stack[top--];
            //top--;
            if (x == minStack[minTop]) {
                minTop--;
            }
            return x;
        }

    }

    //push
    public boolean push(int i) {
        if (top < MAX - 1) {
            stack[++top] = i;
            if(minTop<0){
                minStack[++minTop] = i;
                return true;
            }
            if (i < minStack[minTop]) {
                minStack[++minTop] = i;
            }
            return true;
        } else

            return false;
    }

    //size at const
    public int size() {
        return top < 0 ? 0 : top;
    }

    //min at const
    public int min_value() {
        return minStack[minTop];
    }

    //peek
    public int peek() {
        return top < 0 ? 0 : stack[top];
    }

    public static void main(String[] args) {

        StackImpl s = new StackImpl();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is :" + s.peek());
        System.out.print("Elements present in stack :");
        System.out.println(s.min_value());
    }


}


