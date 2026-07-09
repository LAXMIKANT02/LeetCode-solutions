class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int[] altitude=new int[gain.length+1];
        for(int i=0; i<gain.length; i++){
            altitude[i+1]=altitude[i]+gain[i];
        }
        for(int i : altitude){
            max=Math.max(max,i);
        }
        return max;
    }
}