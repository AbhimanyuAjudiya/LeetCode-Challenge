class Solution {
    public int numberOfArrays(String s, int k) {
        int m = s.length(), n = String.valueOf(k).length();
        int mod = 1_000_000_007;
        
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int start = 0; start < m; ++start) {
            if (s.charAt(start) == '0') {
                dp[start % (n + 1)] = 0;
                continue;
            }
            for (int end = start; end < m; ++end) {
                String currNumber = s.substring(start, end + 1);
                
                if (Long.parseLong(currNumber) > k)
                    break;
                dp[(end + 1) % (n + 1)] = (dp[(end + 1) % (n + 1)] + dp[start % (n + 1)]) % mod;
            }

            dp[start % (n + 1)] = 0;
        }
        return dp[m % (n + 1)];
    }
}
