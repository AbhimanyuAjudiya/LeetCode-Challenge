class Solution {
    public boolean canJump(int[] nums) {
        int lastGoodPos = nums.length - 1;
        for(int i = nums.length - 1; i >= 0; i--){
            if(i + nums[i] >= lastGoodPos){
                lastGoodPos = i;
            }
        }

        return lastGoodPos == 0;
    }
}
