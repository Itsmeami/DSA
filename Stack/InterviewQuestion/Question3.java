package Stack.InterviewQuestion;

import java.util.Stack;
// Next Greater Element
// Input --   1  3  2  1   8  6  3  4
// output --  3  8  8  8  -1  -1  4  -1
public class Question3 {
    public static int[] NextGreaterElement(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] result = new int[arr.length];
        st.push(arr[n-1]);
        result[n-1] = -1;
        for(int i=n-2; i>=0; i--) {
            while( st.size()>0 && st.peek() < arr[i]) {
                st.pop();
            }
            if(st.isEmpty()) {
                result[i]  = -1;
            }
            else {
                result[i] = st.peek();
            }
            st.push(arr[i]);

        }
        return result;

    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,8,6,3,4};
        int[] result = NextGreaterElement(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
