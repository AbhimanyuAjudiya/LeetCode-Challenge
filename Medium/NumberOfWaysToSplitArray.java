class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long rightSum[] = new long[n];
        long leftSum[] = new long[n];
        int j = n-1;
        rightSum[0] = nums[0];
        leftSum[j] = nums[j];
        for(int i=0; i < n - 1; i++){
            rightSum[i+1] = rightSum[i] + nums[i+1];
            leftSum[j-1] = leftSum[j] + nums[j-1];
            j--;
        }
        for(int i = 0; i < n-1; i++){
            if(rightSum[i] >= leftSum[i+1]) j++;
        }
        return j;
    }
}
