class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        int m = accounts.size();
        int n = accounts[0].size();
        int currmax = 0;
        for(int i = 0; i < m; i++)
        {
            int max = 0;
            for(int j = 0; j < n; j++)
            {
                max += accounts[i][j];
            }
            if(max > currmax)
                currmax = max;
        }
    return currmax;
    }
};