package Stack.Question3;

import java.util.Stack;
 // <------Conversion of PostFix to Infix Expression----->
public class PostFixToInFix {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        System.out.println("PostFix Expression : " + str);
        Stack<String> val = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57) {
                val.push(ch+"");
            } else {
                String v2 = val.pop();
                String v1 = val.pop();
                char op = ch;
                // Bracket is used to calculate the correct value .
                String t = "(" + v1 + op + v2 + ")";
                val.push(t);
            }
        }
        System.out.println( "InFix Expression : " + val.peek());
    }
}
