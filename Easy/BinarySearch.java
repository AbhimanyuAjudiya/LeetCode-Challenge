class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        while(start <= end){
            int mid = (start+end) / 2;
            if(nums[mid] == target){ //found
                return mid;
            }
            if(nums[mid] < target){ // right
                start = mid +1;
            } else { // left
                end = mid - 1;
            }
        }
        return -1;
    }
}
