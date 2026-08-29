public class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) 
            return 0;

        int left = 0,right = height.length - 1,leftMax = 0,rightMax = 0,totalWater = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) 
                    leftMax = height[left];
                else 
                    totalWater += leftMax - height[left];
                left++;
            } else {
                if (height[right] >= rightMax)
                    rightMax = height[right];
                else 
                    totalWater += rightMax - height[right];
                right--;
            }
        }

        return totalWater;
    }
}