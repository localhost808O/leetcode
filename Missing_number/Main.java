class Solution {
    public int missingNumber(int[] nums) {
        int sum = nums.length;
        int sumNums = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += i;
            sumNums += nums[i];
        }
        return  sum - sumNums;
    }
}
