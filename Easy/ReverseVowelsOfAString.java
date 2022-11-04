class Solution {
    boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
    public String reverseVowels(String s) {
        StringBuilder ans = new StringBuilder("");        
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;
        while(i<j){
            if(isVowel(arr[i]) && isVowel(arr[j])) {
                char t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;

                i++;
                j--;
            } else if(!isVowel(arr[i])) {
                i++;
            } else if(!isVowel(arr[j])) {
                j--;
            }
        }
        ans.append(arr);
        return ans.toString();
    }
}
