// Recursive approach
    // public static int search(int nums[], int tar, int si, int ei){
    //     //base case
    //     if(si>ei){
    //         return -1;
    //     }
        
    //     int mid = si + (ei - si) / 2;
        
    //     if(nums[mid] == tar){
    //         return mid;
    //     }
        
    //     //check for L1
    //     if(nums[si] <= nums[mid]){
    //         //check for left
    //         if(nums[si] <= tar && tar <=nums[mid]){
    //             return target(nums, tar, si, mid-1);
    //         } else { // check for right
    //             return target(nums, tar, mid+1, ei);               
    //         }
    //     } else { // check for L2
    //         //check for right
    //         if(nums[mid] <= tar && tar <= nums[ei]){
    //             return target(nums, tar, mid+1, ei);
    //         } else { //check for left
    //             return target(nums, tar, si, mid-1);
    //         }
    //     }
    // }


    // Iterative approach 
    public static int search(int nums[], int target, int si, int ei){
        while(si <= ei){
            int mid = si + (ei - si) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[si] <= nums[mid]){//L1 part
                if(nums[si] <= target && target < nums[mid]){ // left part of L1
                    ei = mid - 1;
                } else {                                      // right part of L1
                    si = mid + 1;
                }                
            } else if (nums[mid] <= nums[ei]) {//L2 part
                if(nums[mid] < target && target <= nums[ei]){ // right part of L2
                    si = mid + 1;
                } else {                                      // left part of L2
                    ei = mid - 1;
                }
            }
        }
        return -1;
    }
