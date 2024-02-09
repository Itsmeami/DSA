package Stack.Question;
// Question 2 : Insert at the bottom---
import java.util.Stack;

public class Question2 {
    public static void displayRecursively(Stack<Integer> st) {
        if(st.isEmpty()) return;
        int top = st.pop();
        displayRecursively(st);
        System.out.print(top + " ");
        st.push(top);

    }

    public static void PushAtBottom(Stack<Integer> st, int x) {
        if(st.size() == 0 ) {
            st.push(x);
            return;
        }
        int top = st.pop();
        PushAtBottom(st , x);
        st.push(top);

    }
    public static void main(String args[]) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
//        System.out.print(st);
//        System.out.println();
//        displayRecursively(st);
//        System.out.println();

        PushAtBottom(st,6);
        System.out.println(st);


//        Stack<Integer> rt = new Stack<>();
//        while(st.size() > 0) {
//            rt.push(st.pop());
//        }
//        while(rt.size() > 0) {
//            int x = rt.pop();
//            System.out.print(x + " ");
//            st.push(x);
//        }

        // <---------Using Array------>
//        int n = st.size();
//        int[] arr = new int[n];
//        for(int i = n-1; i>=0; i--) {
//            arr[i] = st.pop();
//        }
//        for(int i=0; i<n-1; i++) {
//            System.out.print(arr[i] + " ");
//            st.push(arr[i]);
//        }


    }

}
