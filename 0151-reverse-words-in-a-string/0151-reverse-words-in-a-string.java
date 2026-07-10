class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int end = s.length()-1;
        while(end>=0){
            while(end>=0 && s.charAt(end)==' '){
                end--;
            }
            if(end<0)
                break;
            int start=end;
            while(start>=0 && s.charAt(start)!=' '){
                start--;
            }
            ans.append(s.substring(start+1,end+1)).append(" ");
            end=start-1;
        }
        return ans.toString().trim();
    }
}