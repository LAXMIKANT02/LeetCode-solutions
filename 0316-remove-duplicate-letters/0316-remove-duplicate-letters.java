class Solution {
    public String removeDuplicateLetters(String s) {
        int[] last = new int[26];
        for(int i=0; i<s.length(); i++){
            last[s.charAt(i)-'a']=i;
        }
        boolean[] seen = new boolean[26];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            int c = s.charAt(i)-'a';
            if(seen[c]) continue;
            seen[c] = true;
            while(!stack.isEmpty() && stack.peek()>c && last[stack.peek()]>i){
                seen[stack.pop()]=false;
            }
            stack.push(c);
        }
        StringBuilder ans = new StringBuilder();
        for(int i: stack){
            ans.append((char)(i+'a'));
        }
        return ans.toString();
    }
}