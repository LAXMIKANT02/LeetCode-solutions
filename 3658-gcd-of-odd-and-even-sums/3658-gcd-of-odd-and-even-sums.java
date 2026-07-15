class Solution {
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0, sumEven = 0, i = 1;
        while (i <= n * 2) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
            i++;
        }
        return gcd(sumOdd, sumEven);
    }
}