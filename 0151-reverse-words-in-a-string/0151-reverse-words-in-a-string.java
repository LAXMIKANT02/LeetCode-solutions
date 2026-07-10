class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder str = new StringBuilder();
        int i=words.length-1;
        while(i>=0){
            str.append(words[i]);
            if(i>0)
                str.append(" ");
            i--;
        }
        return str.toString().trim();
    }
}