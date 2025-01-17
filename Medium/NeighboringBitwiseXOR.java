class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int ans = 0;
        for(int val : derived) ans^= val;
        if(ans == 0) return true;
        return false;
    }
}
