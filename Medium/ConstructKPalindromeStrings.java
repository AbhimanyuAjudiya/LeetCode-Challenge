class Solution {
    public boolean canConstruct(String s, int k) {
        int n = s.length();
        if(k > n) return false;
        if(n == k) return true;
        boolean[] areEvenChars = new boolean[26];
        for(int i = 0; i < n; i++){
            int currChar = (char)(s.charAt(i)) - 'a';
            areEvenChars[currChar] = !areEvenChars[currChar];
        }
        int ans = 0;
        for(int i = 0; i < 26; i++){
            if(areEvenChars[i] == true) ans++;
        }
        return (ans <= k);
    }
}
