package Queue.Implementation;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class basicSTL {
    public static void main(String[] args) {
        // <--- way to implement queue ---->
//        Queue<Integer> q = new ArrayDeque<>(); // first way
        Queue<Integer> q1 = new LinkedList<>(); // second way
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        System.out.println(q1);
        q1.remove();
        System.out.println(q1);
        q1.poll();
        System.out.println(q1);
        System.out.println("Give Top Element " + q1.element());
        System.out.println("Give Top Element " + q1.peek());



    }
}
