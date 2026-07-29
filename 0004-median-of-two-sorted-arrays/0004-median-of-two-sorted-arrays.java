class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int[] merged = new int[n1 + n2];
        System.arraycopy(nums1, 0, merged, 0, n1);
        System.arraycopy(nums2, 0, merged, n1, n2);
        Arrays.sort(merged);
        double median = 0.0000;
        int n = merged.length;
        if (n % 2 == 0)
            median = (double) (merged[(n / 2) - 1] + merged[n / 2]) / 2;
        else
            median = merged[(n / 2)];
        return median;
    }
}