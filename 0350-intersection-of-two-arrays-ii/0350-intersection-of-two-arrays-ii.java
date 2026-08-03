class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        for (int num : nums1)
            map.put(num, map.getOrDefault(num, 0) + 1);

        for (int num : nums2) {
            if (map.containsKey(num)) {
                res.add(num);
                map.put(num, map.get(num) - 1);
                if (map.get(num) == 0)
                    map.remove(num);
            }
        }

        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++)
            result[i] = res.get(i);

        return result;
    }
}