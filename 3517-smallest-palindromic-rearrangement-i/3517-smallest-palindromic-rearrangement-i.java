class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray())
            freq[c - 'a']++;
        char middle = 0;
        StringBuilder left = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1)
                middle = (char) (i + 'a');
            for (int j = 0; j < freq[i] / 2; j++)
                left.append((char) (i + 'a'));
        }

        StringBuilder right = new StringBuilder(left).reverse();

        if (s.length() % 2 == 1)
            return left.toString() + middle + right.toString();
        else
            return left.toString() + right.toString();
    }
}