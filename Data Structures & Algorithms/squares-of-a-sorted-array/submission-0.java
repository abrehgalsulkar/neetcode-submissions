class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] output = new int[nums.length];

        int position = nums.length - 1;
        int left = 0;
        int right = nums.length - 1;

        int leftnum = 0;
        int rightnum = 0;

        while (left <= right) {
            leftnum = nums[left] * nums[left];
            rightnum = nums[right] * nums[right];
            System.out.println(leftnum);
            System.out.println(rightnum);

            if (leftnum > rightnum) {
                output[position] = leftnum;
                left++;
            } else {
                output[position] = rightnum;
                right--;
            }
            position--;
        }
        return output;
    }
}