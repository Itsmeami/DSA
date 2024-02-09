package Strings;
import java.util.*;
//Question 4: java program to reverse  each word in the string.
// Input : I am an educator
// Output : I ma na rotacude

public class Question4 {
    public static void main(String[] args) {
       String str = "I am an  educator";
        System.out.println(str);
       String ans = "";
       StringBuilder st = new StringBuilder("");
       for(int i=0; i<str.length(); i++) {
           char ch = str.charAt(i);
           if(ch != ' ') {
               st.append(ch);
           } else {
               st.reverse();
               ans+=st;
               ans+=" ";
               st = new StringBuilder("");
           }
       }
       st.reverse();
       ans+=st;
        System.out.print(ans);
    }
}
