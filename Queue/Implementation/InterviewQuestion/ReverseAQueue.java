package Queue.Implementation.InterviewQuestion;
//<---Reverse A Queue---->
// In this question we use the stack to reverse the queue
// Time complexity - O(n)
// Space Complexity - O(n)
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;                                                                           

public class ReverseAQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q);
        Stack<Integer> st = new Stack<>();
        while(q.size()>0) {
            st.push(q.remove());
        }
        while(st.size()>0) {
            q.add(st.pop());
        }
        System.out.println(q);
    }
}
