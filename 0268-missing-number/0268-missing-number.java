class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int originalSum = 0;
        for (int num : nums) {
            originalSum += num;
        }
        return expectedSum - originalSum;
    }
}