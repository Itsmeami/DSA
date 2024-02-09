package Strings;

public class Question3 {
    public static boolean isPalimdrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j) {
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }
    public static void main(String[] args) {
        String str1 = "abcdcba";
        int count=0;
        for(int i=0; i<str1.length(); i++) {
            for(int j=i+1; j<=str1.length(); j++) {
                if(isPalimdrome(str1.substring(i,j)) == true) {
                    System.out.print(str1.substring(i,j) + " ");
                    count++;
                }
            }
        }
        System.out.println("\nThe number of palimdrome substring are : " + count);
    }
}
