class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> set = new HashSet<Integer>(); 
        int n = A.length;
        int[] ans = new int[n];
        int count = 0;
        for(int i = 0; i < n; i++){
            if(A[i] == B[i]) count++;
            if(set.contains(A[i])) count++;
            if(set.contains(B[i])) count++;
            set.add(A[i]);
            set.add(B[i]);
            ans[i] = count;
        }
        return ans;
    }
}
