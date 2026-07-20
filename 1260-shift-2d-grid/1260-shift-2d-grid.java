class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int total = m * n;
        k %= total;

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            ans.add(new ArrayList<>(Collections.nCopies(n, 0)));
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int idx = i * n + j;
                int newIdx = (idx + k) % total;
                int newRow = newIdx / n;
                int newCol = newIdx % n;
                ans.get(newRow).set(newCol, grid[i][j]);
            }
        }
        return ans;
    }
}