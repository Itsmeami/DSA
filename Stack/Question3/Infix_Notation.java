package Stack.Question3;
import java.util.*;
// Code for the infix Expression -> 9-5+3*4/6

public class Infix_Notation {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
//        The value stack is used for storing the value and op stack is used for storing operator like +,_,*,/
      Stack<Integer> val = new Stack<>();
      Stack<Character> op = new Stack<>();
      for(int i=0; i<str.length(); i++) {
          char ch = str.charAt(i);
          int ascii = (int)ch; // Here we find the ascii value

          // Ascii Value of Number :- '0' -> 48 and '9' -> 57
          if(ascii>=48 && ascii<=57) { // check whether the ascii value is number or not
              val.push(ascii-48); // push the value in the stack;
          }
          else if(op.size() == 0 || ch == '(' || op.peek() == '(') op.push(ch);
          else if(ch == ')') {
              while(op.peek() != '(') {
                  // Work
                  int v2 = val.pop();
                  int v1 = val.pop();
                  if(op.peek() == '+') val.push(v1+v2);
                  if(op.peek() == '-') val.push(v1-v2);
                  if(op.peek() == '*') val.push(v1*v2);
                  if(op.peek() == '/') val.push(v1/v2);
                  op.pop();
              }
              op.pop(); // '(' - Remove
          }
          else {
              if(ch == '+' || ch == '-') {
                  // here the val at op.peek() is same or greater than ch so we don't need to ckeck priority
                  int v2 = val.pop();
                  int v1 = val.pop();
                  if(op.peek() == '+') val.push(v1+v2);
                  if(op.peek() == '-') val.push(v1-v2);
                  if(op.peek() == '*') val.push(v1*v2);
                  if(op.peek() == '/') val.push(v1/v2);
                  op.pop();
                  op.push(ch);
              }
              if(ch == '*' || ch == '/') {
                  // if the priority of ch and op.peek() is same then perforom the opertion
                if(op.peek() == '*' || op.peek() == '/') {
                    int v2 = val.pop();
                    int v1 =  val.pop();
                    if(op.peek() == '*') val.push(v1*v2);
                    if(op.peek() == '/') val.push(v1/v2);
                    op.pop();
                    op.push(ch);
                }
                else op.push(ch);
              }

          }
      }// val stack size -> 1
      while(val.size() > 1) {
          // The top value of the stack is the second value so here we pop val2 first then val1
          int val2 = val.pop();
          int val1 = val.pop();
          if(op.peek() == '+') val.push(val1+val2);
          if(op.peek() == '-') val.push(val1-val2);
          if(op.peek() == '*') val.push(val1*val2);
          if(op.peek() == '/') val.push(val1/val2);
          op.pop();

      }
        System.out.println(val.peek());

    }
}
