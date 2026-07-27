import java.util.Arrays;
class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return gcd(nums[0],nums[nums.length-1]);
    }
    static int gcd(int n1,int n2)
    {
        int gcdd=1;
        for(int i=2;i<=n1;i++)
            if(n1%i==0 && n2%i==0)
                gcdd=i;

        return gcdd;
    }
}