class Solution {
    public boolean isAnagram(String s, String t) {
    
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        
        return Arrays.equals(sChar, tChar);
    }
}

/*
Runtime: 9 ms, faster than 39.14% of Java online submissions for Valid Anagram.
Memory Usage: 44.7 MB, less than 40.58% of Java online submissions for Valid Anagram. 
*/