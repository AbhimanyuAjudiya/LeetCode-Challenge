class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String preFix = strs[0];
        for(int i = 0;i<strs.length;i++){
            while(strs[i].indexOf(preFix) != 0){
                preFix = preFix.substring(0,preFix.length()-1);
            }
        }
        return preFix;
    }
}
