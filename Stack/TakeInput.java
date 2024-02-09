package Stack;

import java.util.Scanner;
import java.util.Stack;

public class TakeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element that you want to insert in stack : ");
        int n = sc.nextInt();
        System.out.print("Enter elements : ");
        Stack<Integer> st = new Stack<>();
        for(
                int i = 0;
                i<n;i++)

        {
            int x = sc.nextInt();
            st.push(x);

        }
        System.out.println(st);
    }


}
