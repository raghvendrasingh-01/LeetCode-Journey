import java.util.*;
   class Solution {
    public int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
        for(int num : nums) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max3 = max2;
                max2 = num;
            }
            else if(num > max3 && num != max2 && num != max1) max3 = num;
        }
        return (max3 == Long.MIN_VALUE) ? (int)max1 :(int)max3;  
    }
}