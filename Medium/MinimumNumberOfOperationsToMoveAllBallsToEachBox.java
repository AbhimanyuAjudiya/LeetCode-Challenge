class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ans = new int[n];
        int balls = 0;
        int moves = 0;
        for(int i = 0; i < n; i++){
            ans[i] = balls + moves;
            moves+= balls;
            if(boxes.charAt(i) == '1') balls++;
        }
        balls = 0;
        moves = 0;
        for(int i = n-1; i >= 0; i--){
            ans[i] += moves + balls;
            moves += balls;
            if(boxes.charAt(i) == '1') balls++;
        }
        return ans;
    }
}
