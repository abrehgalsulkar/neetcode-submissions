class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }

        int currSum = 0;
        int globalMax = nums[0];

        for (int num:nums) {
            if(num > globalMax && currSum < 0) {
                globalMax = num;
                currSum = num;
            }  else if (num > currSum) {
                if (currSum < 0) {
                    currSum = num;
                } else {
                    currSum += num;
                }
                if (currSum > globalMax) {
                    globalMax = currSum;
                }
            }else {
                currSum += num;
                if (currSum > globalMax) {
                    globalMax = currSum;
                }
            }
        }
        return globalMax;
    }
}
