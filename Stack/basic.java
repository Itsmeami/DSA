package Stack;

import java.util.Stack;

public class basic {
    public static void main(String args[]) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        st.push(34);

        // peek - return the top most element of the stack----->
        System.out.println(st.peek());
        System.out.println(st);
        st.pop(); // - to remove the top most element of the stack
        System.out.println(st);
        System.out.println("Size is : " + st.size());
    }
}
