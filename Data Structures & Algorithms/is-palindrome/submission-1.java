class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        char[] pal = new char[s.length()];
        pal = s.toCharArray();
        for (char c : pal) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        s = sb.toString();
        pal = s.toCharArray();
        for (int i = 0; i < pal.length / 2; i++) {
            if (pal[i] != pal[pal.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
