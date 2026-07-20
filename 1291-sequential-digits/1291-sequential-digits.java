class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList<>();
        String digits = "123456789";
        int maxLen = String.valueOf(high).length();
        for (int len = 2; len <= maxLen; len++) {
            for (int s = 0; s + len <= 9; s++) {
                int num = Integer.parseInt(digits.substring(s, s + len));
                if (num >= low && num <= high)
                    res.add(num);
            }
        }
        Collections.sort(res);
        return res;
    }
}