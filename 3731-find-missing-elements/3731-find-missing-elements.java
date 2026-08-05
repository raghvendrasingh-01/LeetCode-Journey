import java.util.*;
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) 
        {
            min = Math.min(min, num);
            max = Math.max(max, num);
            set.add(num);
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = min; i <= max; i++) 
            if (!set.contains(i))
                ans.add(i);
        return ans;
    }
}