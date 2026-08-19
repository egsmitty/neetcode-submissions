class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> charMap = new HashMap<>();
        for(char c : s.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c,0) + 1);
        }
        for (char c : t.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c,0) - 1);
            if (charMap.get(c) == -1) {
                    return false;
            }
        }
        return true;
    }
}
