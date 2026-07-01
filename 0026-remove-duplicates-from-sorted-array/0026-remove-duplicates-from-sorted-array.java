class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length,k=1;
        if(n==0)return 0;
        for(int i=1;i<n;i++)
            if(nums[i]!=nums[i-1])
                nums[k++]=nums[i];
        return k;
           
    }
}