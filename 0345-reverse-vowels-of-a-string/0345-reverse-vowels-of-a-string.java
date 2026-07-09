class Solution {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int left=0;
        int right=s.length()-1;
        String v = "aeiouAEIOU";
        while(left<right){
            while(left<right && v.indexOf(word[left]) == -1){
                left++;
            }
            while(left<right && v.indexOf(word[right]) == -1){
                right--;
            }
            char temp = word[left];
            word[left]=word[right];
            word[right]=temp;
            left++;
            right--;
        }
        String ans = new String(word);
        return ans;
    }
}