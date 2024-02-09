package Stack.Question3;

import java.util.Stack;
 // Evalution of the Prefix Expression
public class PreFix_Evalution {
    public static void main(String args[]) {
        String str = "-9/*+5346";
        Stack<Integer> val = new Stack<>();
        // IN order to evalute the prefix expression we traverse the loop in reverse order
        for(int i=str.length() -1; i>=0; i--) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57) {
                val.push(ascii - 48);
            } else {
                // Top of the stack is v1 and second top is v2 becase we traverse in reverse order
                int v1 = val.pop();
                int v2 = val.pop();
                if(ch == '+') val.push(v1+v2);
                else if(ch == '-') val.push(v1-v2);
                else if(ch == '*') val.push(v1*v2);
                else if(ch == '/') val.push(v1/v2);
            }
        }
        System.out.println(val.peek());
    }
}
