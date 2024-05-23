class Solution {
    public List<List<Integer>> finalAns = new ArrayList<>();
    public void helper(int[] candidates, int idx, int target, List<Integer> subAns){
        //base
        if(target == 0){
            finalAns.add(new ArrayList<>(subAns));
            return;
        }
        if(idx == candidates.length || target < 0) return;
        //dont pick next element
        helper(candidates, idx+1, target, subAns);
        //pick next element
        subAns.add(candidates[idx]);
        helper(candidates, idx, target - candidates[idx], subAns);
        subAns.remove(subAns.size() - 1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(candidates, 0, target, new ArrayList<>());
        return finalAns;
    }
}
