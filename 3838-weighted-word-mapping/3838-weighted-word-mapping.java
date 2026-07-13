class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String s="";
        for(int i=0;i<words.length;i++)
        {
            int sum=0;
            for(int j=0;j<words[i].length();j++)
                sum+=weights[words[i].charAt(j)-'a'];
            sum=sum%26;
            s+=(char)('z'-sum);
        }
        return s;
    }
}