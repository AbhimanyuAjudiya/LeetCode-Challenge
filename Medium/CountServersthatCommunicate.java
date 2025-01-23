class Solution {
    public int countServers(int[][] grid) {
        int ans = 0;
        int n = grid.length;
        int m = grid[0].length;
        HashMap<Integer, Integer> r = new HashMap<>();
        HashMap<Integer, Integer> c = new HashMap<>();

        for(int i = 0; i < n; i++){
            int noOfServerInRow = 0;
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1) noOfServerInRow++;
                if(noOfServerInRow > 1) break;
            }
            r.put(i, noOfServerInRow);
        }
        for(int i = 0; i < m; i++){
            int noOfServerInCol = 0;
            for(int j = 0; j < n; j++){
                if(grid[j][i] == 1) noOfServerInCol++;
                if(noOfServerInCol > 1) break;
            }
            c.put(i, noOfServerInCol);
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1){
                    if(r.get(i) > 1) ans++;
                    else if(c.get(j) > 1) ans++;
                    else continue;
                }
            }
        }
        return ans;
    }
}
