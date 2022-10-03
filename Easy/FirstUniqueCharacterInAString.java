class Solution {
    public int firstUniqChar(String s) {
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            for( j=0;j<s.length();j++)
            {
                if(j==i)
                {
                    continue;
                }
                if(s.charAt(j)==s.charAt(i))
                {
                    break;
                }
                
            }
            if(j == s.length())
            {
                return i;
            }
        }
        return -1;
    }
}
