class Solution {
    public int minimumPushes(String word) {
        int l=word.length(),n=0,i=1;
        while(l>=8)
        {
            l-=8;
            n+=(i++*8);
        }
        n+=(i++*l);
        return n;
    }
}