
import java.util.Arrays;

//leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FirstAndLastPosition {
    public static void main(String[] args) {
        int arr[]={1,2,7,7,7,8,8,9};
        int target = 7;
        int ans[] = searchRange(arr,target);
        System.out.println(Arrays.toString(ans));


    }
static  int[] searchRange(int[] nums, int target){
    int [] ans = {-1,-1};
    //check for the first occurence if target first 
    int start = search(nums, target, true);
    int end = search(nums, target, false);
    ans[0]=start;
    ans[1]=end;
    return ans;
}


// this funcion just return the index value of target
static int search(int [] nums ,int target , boolean firstStartIndex){
    int ans = -1;
    int start = 0;
    int end =nums.length - 1;

    while (start <= end) {
        // find the middle element
        // int mid = (start + end) / 2; // might be possible that (start + end) exceeds
        // the range of int in java
        int mid = start + (end - start) / 2;

        if (target < nums[mid]) {
            end = mid - 1;
        } else if (target > nums[mid]) {
            start = mid + 1;
        } else {
            //potential ans found
            ans =  mid;
            if (firstStartIndex){ // for again doing left binary search
                end = mid - 1;
            }
            else{ //for again doing right binary search
                start = mid +1;
            }
        }
    }
    return ans;
}

}