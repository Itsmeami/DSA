package Stack.InterviewQuestion;

public class Question4 {
    public static void main(String[] args) {
        int[] arr = {100,80,60,70,60,75,85};
        int n = arr.length;
        int[] result = new int[n];
        for(int i=n-2; i>=0; i--) {
            int count = 1;
            int ele = i+1;
            int j = i;
            while(arr[j] < arr[ele])  {
                count++;
                j--;
            }
            result[ele] = count;
        }
        result[0] = 1;
        for(int i=0; i<n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
