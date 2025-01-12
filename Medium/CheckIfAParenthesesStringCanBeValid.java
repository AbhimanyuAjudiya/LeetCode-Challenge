class Solution {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();
        if(n % 2 == 1) return false;
        Stack<Integer> lockedStack = new Stack<>();
        Stack<Integer> unlockedStack = new Stack<>();
        for(int i = 0; i < n; i++) {
            if(locked.charAt(i) == '0') unlockedStack.push(i);
            else if(s.charAt(i) == '(') lockedStack.push(i);
            else if(s.charAt(i) == ')') {
                if(!lockedStack.isEmpty()) lockedStack.pop();
                else if(!unlockedStack.isEmpty()) unlockedStack.pop();
                else return false;
            }
        }
        while(!lockedStack.isEmpty() && !unlockedStack.isEmpty() && lockedStack.peek() < unlockedStack.peek()){
            lockedStack.pop();
            unlockedStack.pop();
        }
        if(!lockedStack.isEmpty()) return false;
        return true ;
    }
}
