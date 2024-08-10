class Solution {
    private boolean isMagicSquare(int[][] grid, int i, int j) {
        // ensure 1-9
        boolean[] seen = new boolean[10];
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                int num = grid[i + x][j + y];
                if (num < 1 || num > 9 || seen[num]) return false;
                seen[num] = true;
            }
        }
        
        // rows
        for (int x = 0; x < 3; x++) {
            if (15 != grid[i + x][j] + grid[i + x][j + 1] + grid[i + x][j + 2]) return false;
        }

        // columns
        for (int y = 0; y < 3; y++) {
            if (15 != grid[i][j + y] + grid[i + 1][j + y] + grid[i + 2][j + y]) return false;
        }

        // diagonals
        if (15 != grid[i][j] + grid[i+1][j+1] + grid[i+2][j+2] || 15 != grid[i+2][j] + grid[i+1][j+1] + grid[i][j+2]) return false;

        return true;
    }
    
    public int numMagicSquaresInside(int[][] grid) {
        int count = 0;
        for (int i = 0; i <= grid.length - 3; i++) {
            for (int j = 0; j <= grid[0].length - 3; j++) {
                if (isMagicSquare(grid, i, j)) {
                    count++;
                }
            }
        }

        return count;
    }
}
