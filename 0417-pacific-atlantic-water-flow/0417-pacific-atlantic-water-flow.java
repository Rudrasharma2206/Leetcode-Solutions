class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;

        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        // DFS from Pacific edges (top + left)
        for (int i = 0; i < m; i++) dfs(heights, pacific, i, 0, heights[i][0]);
        for (int j = 0; j < n; j++) dfs(heights, pacific, 0, j, heights[0][j]);

        // DFS from Atlantic edges (bottom + right)
        for (int i = 0; i < m; i++) dfs(heights, atlantic, i, n - 1, heights[i][n - 1]);
        for (int j = 0; j < n; j++) dfs(heights, atlantic, m - 1, j, heights[m - 1][j]);

        // Collect cells reachable by both
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }
        return result;
    }

    private void dfs(int[][] heights, boolean[][] visited, int r, int c, int prevHeight) {
        int m = heights.length, n = heights[0].length;
        // bounds check or invalid move
        if (r < 0 || c < 0 || r >= m || c >= n) return;
        if (visited[r][c] || heights[r][c] < prevHeight) return;

        visited[r][c] = true;
        dfs(heights, visited, r + 1, c, heights[r][c]);
        dfs(heights, visited, r - 1, c, heights[r][c]);
        dfs(heights, visited, r, c + 1, heights[r][c]);
        dfs(heights, visited, r, c - 1, heights[r][c]);
    }
    
}