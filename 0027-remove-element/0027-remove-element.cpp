#include <vector>
class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int i = 0, j = nums.size() - 1;
        if(j ==  -1) return 0;
        int c =0;
        while(i <= j)
        {   
            if(nums[j] == val)
            {
                j--;
                c++;
                continue;
            }
            if(nums[i] == val)
            {
                swap(nums[i], nums[j--]);
                c++;
            }
            i++;
        }
       return nums.size() - c;
    }
};