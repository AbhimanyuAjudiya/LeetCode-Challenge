class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] shiftDiff = new int[n];
        int shiftSum = 0;
        char[] ans = s.toCharArray();
        for(int i = 0; i < shifts.length; i++){
            int r = shifts[i][0];
            int l = shifts[i][1];
            int d = shifts[i][2];
            if(d == 0) {
                shiftDiff[r]--;
                if(l + 1 < n) shiftDiff[l+1]++;
            } else {
                shiftDiff[r]++;
                if(l + 1 < n) shiftDiff[l+1]--;
            }
        }
        for(int i = 0; i < n; i++){
            shiftSum = (shiftSum + shiftDiff[i]) % 26;
            if(shiftSum < 0) shiftSum += 26;
            ans[i] = (char) ('a' + ((ans[i] - 'a' + shiftSum) % 26));
        }
        return new String(ans);
    }
}
