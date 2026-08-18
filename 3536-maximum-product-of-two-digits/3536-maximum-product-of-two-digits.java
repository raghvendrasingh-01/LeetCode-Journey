    class Solution {
    public int maxProduct(int n) {
        int max=0,secmax=0;
        while(n!=0)
        {
            int r= n%10;
            if(r>=max)
            {
            secmax=max;    
            max=r;
            }
            else if(r>secmax) secmax=r;
            n/=10;
        }
        return max*secmax;
    }
}
    