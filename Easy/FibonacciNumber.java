class Solution {
    public int fib(int n) {
        int a=0, b=1, c, i=1;
        while(i++<=n){
            c=a+b;
            a=b;
            b=c;
        }
        return a;
    }
}



// class Solution {
//     public int fib(int n) {
//         if(n == 0 || n == 1){
//             return n;
//         }
//         return fib(n-1) + fib(n-2);
//     }
// }
