import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0,maxLength = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char current_char = s.charAt(right);
            if (map.containsKey(current_char) && map.get(current_char) >= left) 
                left = map.get(current_char) + 1;
            map.put(current_char, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}