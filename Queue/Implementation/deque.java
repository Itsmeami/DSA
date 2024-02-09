package Queue.Implementation;
// <-----Deque means Doubly ended Queue------>
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class deque {
    public static void main(String[] args) {
        // Two method to wirte the deque
        //1.Array
        //2.linked list

//        Deque<Integer> dq = new ArrayDeque<>();
       Deque<Integer> dq = new LinkedList<>();
       // Insert the element at the firstPosition of the queue
//       dq.addFirst(1);
//       dq.addFirst(2);
//       dq.addFirst(3);
//       dq.addFirst(4);
        System.out.println(dq);
       // Insert the element at the end position of the queue
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);
        dq.removeLast();
        dq.removeFirst();
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());


    }
}
