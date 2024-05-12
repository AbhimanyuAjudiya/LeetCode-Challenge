class Solution {
    public int[][] largestLocal(int[][] grid) {
        int ans[][] = new int[grid.length - 2][grid.length -2];
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans.length; j++){
                for(int k = i; k < i + 3; k++){
                    for(int l = j; l < j+3; l++){
                        ans[i][j] = Math.max(ans[i][j], grid[k][l]);
                    }
                }
            }
        }
        return ans;
    }
}
