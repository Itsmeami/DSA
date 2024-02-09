package Strings;
//Question 1 :  Given a strings, print all the substrings of s.
public class Question1 {
    public static void main(String[] args) {
        String st = "abcd";
        for(int i=0; i<=3; i++) {
            for(int j=i+1; j<=4; j++) { // here we write 4 because the substring take the less than that number
                System.out.print(st.substring(i,j) + " ");
            }
        }
    }
}
