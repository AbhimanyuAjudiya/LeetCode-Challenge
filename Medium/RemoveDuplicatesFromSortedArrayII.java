class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int idx = 0;
        for(int i = 0; i < n; i++){
            if(i < n - 2 && nums[i] == nums[i+1] && nums[i+1] == nums[i+2]) continue;
            nums[idx++] = nums[i];
        }
        return idx;
    }
}
