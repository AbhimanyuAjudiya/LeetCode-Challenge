class Solution {
    public boolean isPrefixAndSuffix(String s1, String s2){
        int n = s1.length();
        int m = s2.length(); 
        if(n > m) return false;
        for(int i=0; i < n; i++){
            if(s1.charAt(i) != s2.charAt(i))
                return false;
        }
        int p = 0;
        for(int i=m-n; i < m; i++){
            if(s1.charAt(p++) != s2.charAt(i))
                return false;
        }
        return true;
    }
    public int countPrefixSuffixPairs(String[] words) {
        int n = words.length;
        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(isPrefixAndSuffix(words[i], words[j])) ans++;
            }
        }
        return ans;
    }
}
