class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        for (int num : nums) {
            ans ^= num;
        }
        return ans;
    }
}
