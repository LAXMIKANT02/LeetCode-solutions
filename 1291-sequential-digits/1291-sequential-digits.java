class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i < 9; i++)
            queue.offer(i);

        while (!queue.isEmpty()) {
            int num = queue.poll();
            if (num >= low && num <= high)
                res.add(num);

            int lastDigit = num % 10;
            if (lastDigit < 9) {
                int nextNum = num * 10 + (lastDigit + 1);
                if (nextNum <= high)
                    queue.offer(nextNum);
            }
        }
        Collections.sort(res);
        return res;
    }
}