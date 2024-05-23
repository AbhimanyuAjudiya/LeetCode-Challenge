class Solution {
    public List<List<Integer>> finalAns = new ArrayList<>();
    public void helper(int[] nums, int idx, List<Integer> subAns){
        //base
        if(idx == nums.length){
            finalAns.add(new ArrayList<>(subAns));
            return;
        }
        //dont pick next element
        helper(nums, idx+1, subAns);
        //pick next element
        subAns.add(nums[idx]);
        helper(nums, idx+1, subAns);
        subAns.remove(subAns.size() - 1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        helper(nums, 0, new ArrayList<>());
        return finalAns;
    }

}
