class Solution {
    public int climbStairs(int n) {
        if(n==1) return n;
        
        int s1 = 1;
        int s2 = 2;
        for(int i = 3; i<=n;i++){
            int t = s2;
            s2 += s1;
            s1 = t;
        }
        return s2;
    }
}


// ---- Recursive approach ------

// class Solution {
//     public int climbStairs(int n) {
//         if(n == 0 || n == 1){ //base case
//                 return 1;
//         }
//         return climbStairs(n-1) + climbStairs(n-2);
//     }
// }
