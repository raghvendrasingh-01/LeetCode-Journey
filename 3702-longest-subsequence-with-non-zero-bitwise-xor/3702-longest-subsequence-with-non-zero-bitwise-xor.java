class Solution {
    public int longestSubsequence(int[] nums) {
        int xor=0,n=nums.length,s=0;
        for(int i=0; i< n;i++){
            xor=xor^nums[i];
            s+=nums[i];
        }
        if(xor!=0) return n;
        return s==0?0:n-1;
    }
}