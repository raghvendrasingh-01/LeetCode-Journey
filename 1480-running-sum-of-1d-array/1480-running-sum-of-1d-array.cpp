class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        vector<int> sum;
        sum.emplace_back(nums.at(0));
        for(int i = 1; i < nums.size(); i++)
        {
            sum.emplace_back(nums.at(i) + sum.at(i-1));
        }
        return sum;
    }
};