package Stack.Question3;

import java.util.Stack;
// <------ Conversion of prefix to PostFix ------->
public class PreFixToPostFix {
    public static void main(String args[]) {
        String str = "-9/*+5346";
        System.out.println("PreFix Expression :" + str );
        Stack<String> val = new Stack<>();
        // In this we traverse the loop in reverse order
        for(int i=str.length()-1; i>=0; i--) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii <=57) {
                val.push(ch + "");
            }
            else {
                // The first value is v1 because we traverse in reverse order
                String v1 = val.pop();
                String v2 = val.pop();
                char o = ch;
                String t = v1 + v2 + o;
                val.push(t);
            }
        }
        System.out.println("PostFix Expression : " + val.peek());
    }
}
