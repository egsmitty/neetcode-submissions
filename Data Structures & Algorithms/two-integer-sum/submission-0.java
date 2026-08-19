class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int[] numArr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                numArr[0] = numMap.get(complement);
                numArr[1] = i;
                return numArr;
            } else {
                numMap.put(nums[i], i);
            }
        }
        return numArr;
    }
}
