class Solution {
    public long gridGame(int[][] grid) {
        int n = grid[0].length;
        long sum1 = 0;
        long sum2 = 0;
        long ans = Long.MAX_VALUE;
        for(int num : grid[0]) sum1+=num;
        for(int i = 0; i < n; ++i){
            sum1 -= grid[0][i];
            ans = Math.min(ans , Math.max(sum1, sum2));
            sum2 += grid[1][i];
        }
        return ans;
    }
}
