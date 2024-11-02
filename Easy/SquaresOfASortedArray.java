class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        int r = 0; 
        int l = n - 1;
        int i = n - 1;
        while(r != l){
            if(nums[r] * nums[r] > nums[l] * nums[l]) {
                res[i--] = nums[r] * nums[r];
                r++;
            } else {
                res[i--] = nums[l] * nums[l];
                l--;
            }
        }
        res[i--] = nums[l] * nums[l];
        return res;
    }
}
