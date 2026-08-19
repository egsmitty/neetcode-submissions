class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> strMap = new HashMap<>();
        for (String s : strs) {
            String original = s;
            char[] sorted = s.toCharArray();
            Arrays.sort(sorted);
            String key = new String(sorted);
            if (!strMap.containsKey(key)) {
                strMap.put(key, new ArrayList<>());
            }
            strMap.get(key).add(original);
        }
        return new ArrayList<>(strMap.values());
    }
}
