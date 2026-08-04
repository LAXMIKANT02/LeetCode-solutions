class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        int left = 1, right = n - 1;
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        while (left <= right) {
            if (nums[left] == nums[left - 1] + 1) {
                left++;
                continue;
            } else {
                for (int j = nums[left - 1] + 1; j < nums[left]; j++)
                    list.add(j);
            }
            left++;
        }
        return list;
    }
}