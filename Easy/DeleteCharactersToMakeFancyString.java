class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(int i = 0; i < n; i++){
            if(i < n - 2 && s.charAt(i) == s.charAt(i+1) && s.charAt(i+1) == s.charAt(i+2)) continue;
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
