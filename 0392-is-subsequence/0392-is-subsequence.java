class Solution {
    public boolean isSubsequence(String s, String t) {
        int S=0;
        int T=0;
        while(S<s.length() && T<t.length()){
            if(s.charAt(S)==t.charAt(T)){
                S++;
            }
            T++;
        }
        return S==s.length();   
    }
}