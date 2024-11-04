class Solution {
    public String compressedString(String word) {
        StringBuffer sb = new StringBuffer();
        int count = 1;
        for(int i = 0; i < word.length(); i++){
            if(count < 9 && i < word.length() - 1 && word.charAt(i) == word.charAt(i+1)){
                count++;
                continue;
            }
            sb.append(count);
            sb.append(word.charAt(i));
            if(count == 9) count = 1;
            count = 1;
        }
        return sb.toString();
    }
}
