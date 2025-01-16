class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int ans = 0;
        if(m % 2 == 1){
            for(int i = 0; i < n; i++) ans ^= nums1[i];
        }
        if(n % 2 == 1){
            for(int i = 0; i < m; i++) ans ^= nums2[i];
        }
        return ans;
    }
}
