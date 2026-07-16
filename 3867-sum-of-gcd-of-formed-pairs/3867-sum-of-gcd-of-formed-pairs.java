class Solution {
    public int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public long gcdSum(int[] nums) {
        int n = nums.length;
        long ans = 0;
        int max = 0, i = 0, j = 0;
        int[] prefixGcd = new int[n];
        while (i < n) {
            max = Math.max(max, nums[i]);
            prefixGcd[i] = gcd(nums[i], max);
            i++;
        }
        Arrays.sort(prefixGcd);
        while (j < n / 2) {
            long oldAns = gcd(prefixGcd[j], prefixGcd[n - j - 1]);
            System.out.println(ans);
            ans = ans + oldAns;
            j++;
        }
        return ans;
    }
}