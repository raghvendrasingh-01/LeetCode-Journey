class Solution {
    public long sumAndMultiply(int n) {
       if (n == 0) return 0;
        int sum = 0,temp = n;
        long strippedNum = 0,placeValue = 1;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit != 0) {
                sum += digit;
                strippedNum += digit * placeValue;
                placeValue *= 10;
            }
            
            temp /= 10;
        }
        
        return strippedNum * sum;
    }
}