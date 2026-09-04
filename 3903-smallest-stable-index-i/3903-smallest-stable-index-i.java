class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int min[]=new int[n];
        min[n-1]=nums[n-1];
        for (int i=n-2;i>=0;i--) 
            min[i]=Math.min(nums[i],min[i+1]);

        int max=Integer.MIN_VALUE;
        for (int i=0;i<n;i++) {
            max=Math.max(max,nums[i]); 
            int score=max-min[i];   
            if (score<=k) return i;
        }

        return -1;
    }
}