import java.util.Arrays;
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=Arrays.binarySearch(nums, target);
        
        if(n>=0) return n;
        return - n-1;

    }
}