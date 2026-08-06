class Solution {
    public int smallestNumber(int n, int t) {
        if (prod(n) % t == 0)
            return n;
        else
            return smallestNumber(n + 1, t);
    }

    private int prod(int n) {
        int p = 1;
        while (n > 0) {
            p *= (n % 10);
            n /= 10;
        }
        return p;
    }
}