class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        Map<Character, Integer> s1Map = new HashMap<>();
        for (char c : s1.toCharArray()) {
            s1Map.put(c, s1Map.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> s2Map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s2.charAt(i);
            s2Map.put(c, s2Map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            if (s1Map.equals(s2Map)) {
                return true;
            }

            if (i != s2.length() - s1.length()) {
                char left = s2.charAt(i);
                int lCount = s2Map.get(left) - 1;
                char right = s2.charAt(s1.length() + i);

                if (lCount == 0) {
                    s2Map.remove(left);
                } else {
                    s2Map.put(left, lCount);
                }
                s2Map.put(right, s2Map.getOrDefault(right, 0) + 1);
            }
        }
        return false;
    }
}
