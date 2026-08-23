class Solution {
    public int maxProfit(int[] prices) {
        int pro=0,min=prices[0];
        for(int i=0 ; i<prices.length; i++)
    {
        if(prices[i]- min> pro) pro = prices[i]- min;
        if(min>prices[i]) min = prices[i];
    }
    return pro;
    }
}