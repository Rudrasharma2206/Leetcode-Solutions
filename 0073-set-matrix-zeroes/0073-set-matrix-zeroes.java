class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int MARKER = -999999; // Sentinel value (assumes this value isn't naturally in the matrix)

        // Step 1: Mark rows and columns of zeroes
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    // Mark row i
                    for (int k = 0; k < n; k++) {
                        if (matrix[i][k] != 0) matrix[i][k] = MARKER;
                    }
                    // Mark column j
                    for (int k = 0; k < m; k++) {
                        if (matrix[k][j] != 0) matrix[k][j] = MARKER;
                    }
                }
            }
        }

        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == MARKER) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}