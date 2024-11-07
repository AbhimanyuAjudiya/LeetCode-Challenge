class Solution {
    public int largestCombination(int[] candidates) {
        int count = 0;
        for(int i = 0; i < 24; i++){
            int currCombCount = 0;
            for (int num : candidates) 
                if ((num & (1 << i)) != 0) currCombCount++;
            count = Math.max(count, currCombCount);
        }
        return count;
    }
}
