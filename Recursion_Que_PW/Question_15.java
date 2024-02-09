import java.util.ArrayList;

public class Question_15 {
    public static ArrayList<Integer> TargetIndices(int arr[] , int target, int idx) {
        if(idx >= arr.length) return new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        if(arr[idx] == target) ans.add(idx);
        ArrayList<Integer> smallAns = TargetIndices(arr,target, idx+1);
        ans.addAll(smallAns);
        return ans;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,2,5};
        int target = 2;
        ArrayList<Integer> ans = TargetIndices(arr,target,0);
        for(Integer i: ans) System.out.print(i + " ");
    }
}
