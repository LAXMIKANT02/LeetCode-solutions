class Solution {
    public int maxProduct(int n) {
        int[] digits = new int[String.valueOf(n).length()];
        int idx = digits.length-1;
        while(n>0){
            digits[idx--] = n % 10;
            n /= 10;
        }

        int maxProd = 0;
        for(int i=0; i<digits.length;i++){
            for(int j=i+1; j<digits.length; j++){
                maxProd = Math.max(maxProd, digits[i]*digits[j]);
            }
        }

        return maxProd;
    }
}