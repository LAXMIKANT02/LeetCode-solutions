class Solution {
    public boolean isAnagram(String s, String t) {
        char[] S = s.toCharArray();
        Arrays.sort(S);
        char[] T = t.toCharArray();
        Arrays.sort(T);
        if (s.length() != t.length()) {
            return false;
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (S[i] != T[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}