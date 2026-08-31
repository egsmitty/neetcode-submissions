class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        while (left < right && left != right) {
            int comp = target - numbers[left];
            if (numbers[right] == comp) {
                ans[0] = left + 1;
                ans[1] = right + 1;
                break;
            }
            else if (numbers[right] > comp) {
                right--;
            }
            else {
                left++;
            }
        }
        return ans;
    }
}
