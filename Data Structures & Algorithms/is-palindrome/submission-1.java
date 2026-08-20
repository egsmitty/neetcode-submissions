// My naive solution under pressure (forgot the reverse() existed) 
// Panicked on how to use stringbuilder after a while of not using it!
// Works but very cluttered and not max eff for Space complexity

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
