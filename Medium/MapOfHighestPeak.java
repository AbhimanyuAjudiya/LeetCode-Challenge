public class Solution {

    public int[][] highestPeak(int[][] isWater) {
        int rows = isWater.length;
        int columns = isWater[0].length;
        final int INF = rows * columns; 
        int[][] cellHeights = new int[rows][columns];
        for (int[] row : cellHeights) {
            Arrays.fill(row, INF);
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                if (isWater[row][col] == 1) {
                    cellHeights[row][col] = 0; 
                }
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                int minNeighborDistance = INF; 

                int neighborRow = row - 1;
                int neighborCol = col;
                if (isValidCell(neighborRow, neighborCol, rows, columns)) {
                    minNeighborDistance = Math.min(
                        minNeighborDistance,
                        cellHeights[neighborRow][neighborCol]
                    );
                }

                neighborRow = row;
                neighborCol = col - 1;
                if (isValidCell(neighborRow, neighborCol, rows, columns)) {
                    minNeighborDistance = Math.min(
                        minNeighborDistance,
                        cellHeights[neighborRow][neighborCol]
                    );
                }

                cellHeights[row][col] = Math.min(
                    cellHeights[row][col],
                    minNeighborDistance + 1
                );
            }
        }

        for (int row = rows - 1; row >= 0; row--) {
            for (int col = columns - 1; col >= 0; col--) {
                int minNeighborDistance = INF; 

                int neighborRow = row + 1;
                int neighborCol = col;
                if (isValidCell(neighborRow, neighborCol, rows, columns)) {
                    minNeighborDistance = Math.min(
                        minNeighborDistance,
                        cellHeights[neighborRow][neighborCol]
                    );
                }

                neighborRow = row;
                neighborCol = col + 1;
                if (isValidCell(neighborRow, neighborCol, rows, columns)) {
                    minNeighborDistance = Math.min(
                        minNeighborDistance,
                        cellHeights[neighborRow][neighborCol]
                    );
                }

                cellHeights[row][col] = Math.min(
                    cellHeights[row][col],
                    minNeighborDistance + 1
                );
            }
        }
        return cellHeights; 
    }

    private boolean isValidCell(int row, int col, int rows, int columns) {
        return row >= 0 && col >= 0 && row < rows && col < columns;
    }
}
