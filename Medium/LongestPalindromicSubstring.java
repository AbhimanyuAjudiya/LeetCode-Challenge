class Solution {
    public String longestPalindrome(String s) {
        int leftIdx = 0;
        int rightIdx = 0;

        for (int i = 0; i < s.length(); i++) {
            int oddLength = expand(i, i, s);//got odd substrig
            if (oddLength > rightIdx - leftIdx + 1) {
                int dist = oddLength / 2;
                leftIdx = i - dist;
                rightIdx = i + dist;
            }

            int evenLength = expand(i, i + 1, s);//got even sub string
            if (evenLength > rightIdx - leftIdx + 1) {
                int dist = (evenLength / 2) - 1;
                leftIdx = i - dist;
                rightIdx = i + 1 + dist;
            }
        }
        return s.substring(leftIdx, rightIdx + 1);
    }
    public int expand(int left, int right, String s) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
