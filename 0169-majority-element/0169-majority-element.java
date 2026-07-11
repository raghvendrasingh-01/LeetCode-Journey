class Solution {
    public int majorityElement(int[] nums) {
        int k = nums[0],c = 0;
        for (int num : nums) {
            if(c == 0) k=num;
            if (num == k) c++;
            else c--;
        }
        return k;
    }
}