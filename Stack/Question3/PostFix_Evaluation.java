package Stack.Question3;
import java.util.Stack;
// Evalutaion of the postfix expression
public class PostFix_Evaluation {
    public static void main(String[] args) {
        String str = "953+4*6/-";
//        Take the stack to push the value
        Stack<Integer> val = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch; // convert the ch into ascii value
            if(ascii>=48 && ascii <=57) { // check whether ascii is number or not
                val.push(ascii-48);
            } else {
                // Work
                int v2 = val.pop();
                int v1 = val.pop();
                if(ch == '+') val.push(v1+v2);
                else if(ch == '-') val.push(v1-v2);
                else if(ch == '*') val.push(v1*v2);
                else if(ch == '/') val.push(v1/v2);
            }
        }
        System.out.println(val.peek());
    }
}
