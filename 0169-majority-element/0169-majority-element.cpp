class Solution {
public:
    int majorityElement(vector<int>& nums) {
        unordered_map<int,int> f;
        int n = nums.size() / 2 , i;
    for(i = 0; i < nums.size(); i++)
        f[nums[i]]++;
    for(i = 0; i < nums.size(); i++)
        if(f[nums[i]] > n) break;
    return nums[i];
    }
};