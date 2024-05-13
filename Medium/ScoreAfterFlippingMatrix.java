class Solution {
    public int matrixScore(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        printGrid(grid);
        for(int r = 0; r < row; r++){
            if(grid[r][0] == 0){
                flipRow(grid, r);
            }
        }
        for(int r = 0; r < row; r++){
            for(int c = 1; c < col; c++){
                colOnes(grid, c);
                printGrid(grid);
            }
        }
        int rowSum = 0;
        for(int r = 0; r < row; r++){
            int currNum = 0;
            for(int c = 0; c < col; c++){
               if(grid[r][col-1-c] == 1) 
                currNum |= (1<<(c));
            }
            rowSum += currNum;
        }
        return rowSum;
    }
    private void printGrid(int grid[][]){
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
               System.out.print(grid[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    private void colOnes(int grid[][], int c){
        int oneCnt = 0;
        for(int r = 0; r < grid.length; r++){
            if(grid[r][c] == 1)oneCnt++;
        }
        int zeroCnt = grid.length - oneCnt;
        if(zeroCnt >  oneCnt) flipCol(grid, c);
    }
    private void flipRow(int grid[][], int r){
       for(int c = 0; c < grid[0].length; c++){
            grid[r][c] = (grid[r][c] == 1) ? 0 : 1;
       }
    }
    private void flipCol(int grid[][], int c){
       for(int r = 0; r < grid.length; r++){
            grid[r][c] = (grid[r][c] == 1) ? 0 : 1;
       }
    }
}
