class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long res = 0;
        int i = 0;
        while( i < nums.length){
            int consecutiveZeros = 0;
            while(i < nums.length && nums[i] == 0){
                consecutiveZeros+=1;
                i++;
                res += consecutiveZeros;
            }
            i++;
        }
        return res;
    }
}
