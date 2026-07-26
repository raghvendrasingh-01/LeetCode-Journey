class Solution {
    public int maximumProduct(int[] nums) {
        int max=-1001,secmax=-1001,trimax=-1001,min=10001,secmin=1001;
        for(int r:nums)
        {
            if(r>=max)
            {
            trimax=secmax;
            secmax=max;    
            max=r;
            }
            else if(r>=secmax) 
            {
                trimax=secmax;
                secmax=r;
            }
            else if(r>trimax) trimax=r;
            if (r <= min) {
                secmin = min;
                min = r;
            } 
            else if (r < secmin) {
                secmin = r;
            }
        }
         return Math.max(
            max * secmax * trimax,
            max * min * secmin
        );
    }
}