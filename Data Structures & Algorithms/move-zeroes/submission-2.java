class Solution {
    public void moveZeroes(int[] nums) {
        // left is the first 0
        // right is the next non zeroe elemtn to swap with

        int left = 0;
        int right = 0;

        while ((left < nums.length-1) && nums[left] != 0) {
            left++;
        }
        if (nums[left] != 0) {
            return;
        }

        right = left + 1;

        while (right < nums.length) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;

                left++;
            }
            right++;
        }
    }
}