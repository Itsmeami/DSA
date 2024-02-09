package Strings;
import java.util.*;
// Question 2:  Given a string, the task is to toggle all the characters of the string i.e to convert UpperCase to Lower Case and vice versa.
// INPUT : Aman
// OUTPUT : aMAN
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ' ') continue; // if there is a space in string then skip it and continue with the next statement.
            boolean flag = true; // Capital
            int ascii = (int)ch;

            if(ascii>=97) flag = false; // it basically tell us the character is small.
            if(flag == true) { // char is capital and change it in small
                ascii+=32;
                char dh = (char)ascii;
                str.setCharAt(i,dh);
            }
            else {  // char is small and change it to capital
                ascii-=32;
                char dh = (char)ascii;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);
    }
}
