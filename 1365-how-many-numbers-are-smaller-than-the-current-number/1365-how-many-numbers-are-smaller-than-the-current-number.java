class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];

        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> rank = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            rank.putIfAbsent(sorted[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            ans[i] = rank.get(nums[i]);
        }

        return ans;
    }
}
