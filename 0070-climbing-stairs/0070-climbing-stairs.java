class Solution {
    public int climbStairs(int n) {
        if (n==0)
            return 1;
        if(n<0)
            return 0;
        int a=0,b=1;
         for (int i = 1; i <= n; i++) {
            int temp=a+b;
            a=b;
            b=temp;
        }
        return b;
    }
}