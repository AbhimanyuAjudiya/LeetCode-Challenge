class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < nums.length; i++) { 
            cs += nums[i];
            max = Math.max(max, cs);
            if(cs < 0){
                cs = 0;
            }
        }
        return max;
    }
}
