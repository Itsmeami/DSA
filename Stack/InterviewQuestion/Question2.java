package Stack.InterviewQuestion;
// Remove the consequtive sequences
// Input -- 1  2  2  3  10  10  10  4  4  4  5  7  7  2
// Ouput -- 1  3  5  2
import java.util.Stack;
public class Question2 {
    public static int[] removeConsecutiveSequence(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        for(int i=0; i<n; i++) {
            if(stack.isEmpty() || stack.peek() != arr[i]) stack.push(arr[i]);
            else if(stack.peek() == arr[i]) {
                // i == n-1 - if we are in last postion and thier is no further element in stack so we remove element    
                if(i == n-1 || arr[i] != arr[i + 1]) stack.pop();
            }
        }
        int[] result = new int[stack.size()];
        int m = stack.size();
        // In the stack we only access the top element that why we run a for loop in reverse order and in this manner we insert first(who inserted first) element of stack in
        // first position of array
        for(int i=m-1; i>=0; i--) {
            result[i] = stack.pop();
        }
        return result;

    }
    public static void main(String args[]) {
        int[] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int[] result = removeConsecutiveSequence(arr);
        for(int i=0; i<result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
