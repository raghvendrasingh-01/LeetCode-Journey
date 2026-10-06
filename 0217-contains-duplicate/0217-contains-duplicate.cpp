class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
    unordered_map<int,int> f;
    int i;
    for(i = 0; i < nums.size(); i++)
        f[nums[i]]++;
    for(i = 0; i < nums.size(); i++)
        if(f[nums[i]] > 1) return true;
    return false;
    
    }
};