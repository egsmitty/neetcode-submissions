class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        char[] paren = new char[s.length()];
        paren = s.toCharArray();
        for (char c : paren) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                else if (c == ')' && stack.pop() != '(') {
                    return false;
                }
                else if (c == ']' && stack.pop() != '[') {
                    return false;
                }
                else if (c == '}' && stack.pop() != '{') {
                    return false;
                }
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}
