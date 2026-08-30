class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int prod = 1, zeroCount = 0;
        for (int num : nums) {
            if (num != 0) {
                prod *= num;
            } else {
                zeroCount++;
            }
        }

        if (zeroCount > 1) {
            return new int[nums.length];
        }
        for (int i = 0; i < nums.length; i++) {
            if (zeroCount > 0) {
                output[i] = (nums[i] == 0) ? prod : 0;
            }
            else { 
                output[i] = prod / nums[i];
            }
        }
        return output;
    }
}  
