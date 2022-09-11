public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Set<Integer> muffin = new HashSet<>();
        int longest = 1;

        for (int num : nums) {
            muffin.add(num);
        }
        
        for (int num : nums) {
            if (!muffin.contains(num - 1)) {
                int count = 1;
                while (muffin.contains(num + 1)) {
                    num++;
                    count++;
                }
                if (count > longest) {
                    longest = count;
                } else {
                    longest = longest;
                }
            }
        }
        return longest;
    }
}

/* 
Runtime: 1022 ms, faster than 5.07% of Java online submissions for Longest Consecutive Sequence.
Memory Usage: 135.3 MB, less than 33.56% of Java online submissions for Longest Consecutive Sequence.
*/