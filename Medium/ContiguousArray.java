class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> counts = new HashMap();
        counts.put(0, -1);

        int max_len = 0;
        int counter = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                counter += -1;
            } else {
                counter += 1;
            }

            if(counts.containsKey(counter)){
                max_len = Math.max(max_len, i-counts.get(counter));
            } else {
                counts.put(counter, i);
            }
        }

        return max_len;
    }
}
