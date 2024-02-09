package Stack.Question3;

import java.util.Stack;
// <------Conversion of a PostFix expression into the Prefix Expression ------>
public class PostFixToPreFix {
    public static void main(String args[]) {
        String str = "953+4*6/-";
        System.out.println("PostFix Expression : " + str);
        Stack<String> val = new Stack<>();
        // Here we traverse a loop form the starting of the string
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57) {
                val.push(ch+"");
            }
            else {
                // The first value is v2 because we traverse a loop form the starting
                String v2 = val.pop();
                String v1 = val.pop();
                String t = ch + v1 + v2;
                val.push(t);
            }
        }
        System.out.println( "PreFix Expression  : " + val.peek());
    }
}
