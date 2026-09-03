class Solution {
    public boolean uniformArray(int[] nums1) {
        int min=nums1[0],flag=0;
        for(int i=0;i<nums1.length;i++)
        {
            if(nums1[i]%2 == 1) flag=1;
            if(nums1[i]<min) min = nums1[i];
        }
        return min%2==1 || flag == 0;
    }
}