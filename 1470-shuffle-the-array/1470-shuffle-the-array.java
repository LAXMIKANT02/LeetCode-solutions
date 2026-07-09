class Solution {
    public int[] shuffle(int[] nums, int n) {
        int m = nums.length/2;
        int[] arr = new int[nums.length];
        int j = m;
        int k = 0, i=0;
        while(i<m){
            arr[k] = nums[i];
            k++;
            arr[k] = nums[j];
            k++;
            j++;
            i++;
        }
        return arr;
    }
}