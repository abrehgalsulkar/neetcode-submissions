class Solution {
    public int missingNumber(int[] nums) {
        int calculated_sum = 0;
        int expected_sum = sum(nums.length);

        for (int i = 0; i < nums.length; i++) {
            calculated_sum += nums[i];
        }

        return expected_sum - calculated_sum;
    }

    public int sum (int n) {
        return (n*(n+1))/2;
    }
}
