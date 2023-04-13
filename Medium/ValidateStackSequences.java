class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i = 0;
        Stack<Integer> s = new Stack<>();

        for(int n : pushed){
            s.push(n);
            while(i < popped.length && !s.isEmpty() && popped[i] == s.peek()){
                s.pop();
                i++;
            }
        }
        return s.isEmpty();
    }
}
