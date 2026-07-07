import java.util.Arrays;
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=Arrays.binarySearch(nums, target);
        return n>=0?n:-n-1;

    }
}