package DataStructures;

import java.util.Stack;

public class StackImpl1 {

    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    public void push(int i) {
        stack1.push(i);
      //  System.out.println(stack1.size());
    }

    public void moveQueue() {

        while(!stack1.empty()) {
            stack2.push(stack1.pop());
        }
    }

    public int pop() {
        int x = stack2.pop();
        return x;
    }
    int middle;
    public int findMiddle(int index) {

        System.out.println(stack2.elementAt(index));

        return middle;
    }
}


class main {
    public static void main(String[] args) {
        int x;
        StackImpl1 s1 = new StackImpl1();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.moveQueue();
        x = s1.pop();
        System.out.println( x);
        x = s1.pop();
        System.out.println( x);
        x = s1.pop();
        System.out.println( x);
        x = s1.pop();
        System.out.println( x);
        x = s1.pop();
        System.out.println( x);
        s1.findMiddle(3);

    }
}