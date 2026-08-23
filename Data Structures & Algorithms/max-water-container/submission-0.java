class Solution {
    public int maxArea(int[] heights) {
        int maxA = 0;
        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
            int height = Math.min(heights[left], heights[right]);
            int width = right - left;
            maxA = Math.max(height * width, maxA);

            if (heights[left] == height) {
                left++;
            } else {
                right--;
            }
        }

        return maxA;
    }
}
