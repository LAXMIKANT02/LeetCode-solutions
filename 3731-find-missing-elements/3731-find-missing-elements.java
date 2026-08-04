class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();

        List<Integer> res = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if (!set.contains(i))
                res.add(i);
        }

        return res;
    }
}