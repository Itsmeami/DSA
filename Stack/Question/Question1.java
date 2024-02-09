package Stack.Question;
import java.util.Scanner;
import java.util.Stack;
 // Question 1: Copy the content of one stack in another stack in  same order..
public class Question1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        // Reverse the stack
        Stack<Integer> gt = new Stack<>();
        while(st.size()>0) {
//            int x = st.peek();
//            rt.push(x);
//            st.pop();
            // Hm ye likh sakate hai
            gt.push(st.pop());
        }
        System.out.println(gt);
        Stack<Integer> rt = new Stack<> ();
        while(gt.size() > 0) {
            rt.push(gt.pop());
        }
        System.out.println(rt);

    }
}
