class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int longest = 0;
        Map<Character, Integer> sMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (sMap.containsKey(c)) {
                left = Math.max(sMap.get(c) + 1, left);
            }
            longest = Math.max(i - left + 1, longest);
            sMap.put(c, i);
        }
        return longest;
    }
}
