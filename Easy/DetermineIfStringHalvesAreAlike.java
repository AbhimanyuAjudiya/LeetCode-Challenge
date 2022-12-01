class Solution {
    public boolean halvesAreAlike(String s) {
        String a = s.substring(0, s.length()/2);
        String b = s.substring(s.length()/2);
        int p = 0, q = 0;
        for (int i = 0; i < a.length(); i++)
        {
            char c = Character.toLowerCase(a.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') p++;
            char d = Character.toLowerCase(b.charAt(i));
            if (d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u') q++;
        }
        return (p==q);
    }
}
