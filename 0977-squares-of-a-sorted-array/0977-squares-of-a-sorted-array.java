class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int l = 0;
        int r = n-1;
        int p = n-1;

        while(l<=r){
            int lSqr = nums[l]*nums[l];
            int rSqr = nums[r]*nums[r];

            if(lSqr > rSqr){
                res[p] = lSqr;
                l++;
            }else{
                res[p] = rSqr;
                r--;
            }
            p--;
        }
        return res;
    }
}