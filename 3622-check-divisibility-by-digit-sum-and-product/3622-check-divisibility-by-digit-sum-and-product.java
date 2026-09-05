class Solution {
    public boolean checkDivisibility(int n) {
        int num=n,sum=0,pro=1;
        while(num!=0)
        {
            sum+=num%10;
             pro*=num%10;
             num/=10;
        }
        return n%(sum+pro) == 0;
    }
}