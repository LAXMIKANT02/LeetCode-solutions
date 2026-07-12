class Solution {
    public boolean increasingTriplet(int[] nums) {
        int firstSmall=Integer.MAX_VALUE;
        int secSmall=Integer.MAX_VALUE;
        for(int num : nums){
            if(num<=firstSmall){
                firstSmall=num;
            }else if(num<=secSmall){
                secSmall=num;
            }else{
                return true;
            }
        }
        return false;
    }
}