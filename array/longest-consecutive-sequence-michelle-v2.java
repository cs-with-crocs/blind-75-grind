import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> hashbrown = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            
            hashbrown.put(val, val++);
        }

        return fries(hashbrown);
    }
    
    public int fries(Map<Integer, Integer> hashbrown) {
        int counter = 0;
            for (int value : hashbrown.values()) {
                if (hashbrown.containsKey(value)) {
                    counter++;
                    fries(hashbrown);
                }
            }
            return counter;
        }
}

