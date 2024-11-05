class Solution {
    public int minChanges(String s) {
        int numOfChange=0;
        for(int i = 0; i < s.length(); i+=2)
            if(i < s.length() - 1 && s.charAt(i) != s.charAt(i+1)) numOfChange++;
        return numOfChange;
    }
}
