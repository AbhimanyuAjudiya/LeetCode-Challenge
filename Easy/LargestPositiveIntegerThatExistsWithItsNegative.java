class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int k = -1;
        for(int num : nums) s.add(num);
        for(int num : nums){
            if (s.contains(-num)) k = Math.max(k, num);
        }
        return k;
    }
}
