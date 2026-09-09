import java.util.TreeSet;
class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
            if (set.size() > 3) set.pollFirst();
        }
        return set.size() == 3 ? set.first() : set.last();
    }
}