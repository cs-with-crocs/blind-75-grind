class Solution {
    public int longestConsecutive(int[] nums) {
//         int[] sorted = new int[nums.length + 1];
        
//         for (int i = 0; i < nums.length; i++) {
//             if (i < sorted[i]) {
//                 sorted[i-1] = i;
//             }
        Arrays.sort(nums);
        int counter = 0;
        
        for (int i = 1; i < nums.length; i++) {
            int prev = nums[i--];
            int shouldbe = prev + 1;
            
            boolean arg = nums[i] == shouldbe;
            
            if (arg) {
                counter++;
            } else {
                return counter;
            }
        }
        return counter;
        
    }
}