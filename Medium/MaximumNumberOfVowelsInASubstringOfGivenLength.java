class Solution {
    public int maxVowels(String s, int k) {
        
        int n = s.length();
        int[] arr = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
            arr[i] = count;
        }
        int max = 0;
        for (int i = 0; i <= n - k; i++) {
            int end = i + k - 1;
            if (i == 0) {
                max = Math.max(max, arr[end]);
            } else {
                max = Math.max(max, arr[end] - arr[i - 1]);
            }
        }
        return max;
    }
}
