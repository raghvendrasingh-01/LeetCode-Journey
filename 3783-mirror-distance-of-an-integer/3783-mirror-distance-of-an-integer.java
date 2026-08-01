class Solution {
    public int mirrorDistance(int n) {
        int num=n,sum=0;
        while(num!=0)
        {
            sum=sum*10 + num%10;
            num/=10;
        }
        return Math.abs(sum-n);
    }
}