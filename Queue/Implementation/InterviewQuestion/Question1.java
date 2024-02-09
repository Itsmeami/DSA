package Queue.Implementation.InterviewQuestion;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.*;

//Question 1:- Reverse first k elements of Queue
// arr = [1 2 3 4 5] and k=3
// Output:-[3 2 1 4 5]
public class Question1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size of arr : ");
//        int n = sc.nextInt();
//        System.out.println();
//        int[] arr = new int[n];
//        System.out.print("Enter elements of arr : ");
//        for(int i=0; i<n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println();
//        System.out.print("Enter the value of k : ");
//        int k = sc.nextInt();
//        System.out.println(k);
        int k  = 3;
       Queue<Integer> q = new LinkedList<>();
       q.add(1);
       q.add(2);
       q.add(3);
       q.add(4);
       q.add(5);
        System.out.println(q);
       int n = q.size();
       Stack<Integer> st = new Stack<>();
       // Here we push the elements in the stack that we want to reverse in queue
       for(int i=0; i<k; i++) {
           st.push(q.remove()); // 1->2->3
       }
       while(st.size()>0) {
           q.add(st.pop()); // 4 5 3 2 1
       }
       for(int i = 0; i<n-k; i++) {
           q.add(q.remove()); // 3 2 1 4 5
       }
        System.out.println(q);


    }
}
