class Solution {
    public String smallestSubsequence(String s) {
        int[] freq = new int[26];
        boolean[] seen = new boolean[26];
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray())
            freq[c - 'a']++;
        for (char c : s.toCharArray()) {
            int x = c - 'a';
            freq[x]--;
            if (seen[x])
                continue;
            while (!stack.isEmpty() && stack.peek() > c && freq[stack.peek() - 'a'] > 0) {
                seen[stack.pop() - 'a'] = false;
            }
            stack.push(c);
            seen[x] = true;
        }
        StringBuilder ans = new StringBuilder();
        for (char c : stack)
            ans.append(c);
        return ans.toString();
    }
}