// Questioin 13 - Given an array of n integers and a target value x. Print whether x exits in the array or not.
// Constraints : 0<=n<1e6, -1e8<=x<=1e8, --1e8<=arr[i]<=1e8

public class Question_13 {

    public static int IndexFound(int[] arr, int target, int idx) { // -This function return index if the element is fonund in array
        if(idx >= arr.length) return -1;
        if(arr[idx] == target) return idx;
        return IndexFound(arr,target, idx+1); //  return IsElementPresent(arr,target, idx+1); isaka mtlb hai ---
        // if (IsElementPresent(arr,target, idx+1) == true )  return ture;
        //else return false;

    }

    public static boolean IsElementPresent(int[] arr, int target, int idx) {
        if(idx >= arr.length) return false;
        if(arr[idx] == target) return true;
        return IsElementPresent(arr,target, idx+1); //  return IsElementPresent(arr,target, idx+1); isaka mtlb hai ---
                                                        // if (IsElementPresent(arr,target, idx+1) == true )  return ture;
                                                       //else return false;

    }
    public static void main(String[] args) {
        int[] arr = {1,4,5,6};
        int target = 4;
        if(IsElementPresent(arr,target,0)) { // IsElementPresent(arr,target,0) == true
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        System.out.println(IndexFound(arr,target, 0));

    }
}
