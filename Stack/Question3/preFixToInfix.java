package Stack.Question3;
// <-----Conversion of PreFix to Infix Expression------>
import java.util.Stack;
public class preFixToInfix {
    public static void main(String args[]) {
        System.out.println("<-------PreFix To Infix Conversion ------>");
        String str = "-9/*+5346";
        System.out.println("PreFix Expression : " + str);
        Stack<String> val = new Stack<>();
        for(int i=str.length()-1; i>=0; i--) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57) {
                val.push(ch + "");
            } else {
                String v1 = val.pop();
                String v2 = val.pop();
                char op = ch;
                String t = "(" + v1 + op + v2 + ")";
                val.push(t);

            }
        }
        System.out.println( "Infix Expression : " +  val.peek());
    }
}
