class Solution {
    public void reverseString(char[] s) {
       int n=s.length;
        int start=0,end=n-1;
        while(start<end){
           char t=s[start];
            s[start]=s[end];
            s[end]=t;
            start++;
            end--;
        }
        
    }
}