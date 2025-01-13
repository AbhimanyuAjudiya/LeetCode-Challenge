class Solution {
    public int minimumLength(String s) {
        int ans = 0;
        int[] ch = new int[26];
        for(int c: s.toCharArray()) ch[c-'a']++;
        for(int c: ch){
            if (c == 0) continue;
            if(c % 2 == 1) ans++;
            else ans+=2;
        }
        return ans;
    }
}
