class Solution {
    
    public int dfs(int i, int j, int[][] grid){
        if(i >= grid.length){                                               //base case
            return j;
        }
        
        if(grid[i][j] == 1 && j + 1 < grid[0].length && grid[i][j+1] == 1){ //left to right
            return dfs(i+1,j+1,grid);
        } 
        else if(grid[i][j] == -1 && j - 1 >= 0 && grid[i][j-1] == -1){.    //right to left
            return dfs(i+1,j-1,grid);
        } else {
            return -1;
        }
    }
    public int[] findBall(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int ans[] = new int[col];
        for(int j = 0; j< col; j++){
            ans[j] = dfs(0, j, grid);
        }
        return ans;
    }
}
