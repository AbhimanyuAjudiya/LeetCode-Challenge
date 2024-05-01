class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuffer sb = new StringBuffer();
        Stack<Character> s = new Stack<Character>();
        boolean doesContains = true;
        int i;
        for(i = 0;i < word.length(); i++){
            char c = word.charAt(i);
            if(c == ch) {
                s.push(c);
                doesContains = false;
                break;
            }
            s.push(c);
        }
        i++;
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        while(i < word.length()){
            sb.append(word.charAt(i++));
        }
        return doesContains ? word : sb.toString() ;
    }
}
