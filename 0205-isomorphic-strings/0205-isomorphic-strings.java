class Solution {
    public boolean isIsomorphic(String s, String t) {
        int l1=s.length(),l2=t.length();
        if(l1!=l2) return false;
        for(int i=0;i<l1;i++)
        {
            if(s.lastIndexOf(s.charAt(i)) != t.lastIndexOf(t.charAt(i)))
                return false;
        }
        return true;
    }
}