class Solution {
    public int search(int[] nums, int target) {
        return target(nums, target, 0, nums.length-1);
    }
    
    public static int target(int nums[], int tar, int si, int ei){
        //base case
        if(si>ei){
            return -1;
        }
        
        int mid = si + (ei - si) / 2;
        
        if(nums[mid] == tar){
            return mid;
        }
        
        //check for L1
        if(nums[si] <= nums[mid]){
            //check for left
            if(nums[si] <= tar && tar <=nums[mid]){
                return target(nums, tar, si, mid-1);
            } else { // check for right
                return target(nums, tar, mid+1, ei);               
            }
        } else { // check for L2
            //check for right
            if(nums[mid] <= tar && tar <= nums[ei]){
                return target(nums, tar, mid+1, ei);
            } else { //check for left
                return target(nums, tar, si, mid-1);
            }
        }
    }
}
