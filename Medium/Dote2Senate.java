class Solution {
    public String predictPartyVictory(String senate) {
        int rCount = 0, dCount = 0;
        int dFloatingBan = 0, rFloatingBan = 0;
        Queue<Character> q = new LinkedList<>();
        for (char c : senate.toCharArray()) {
            q.add(c);
            if (c == 'R') rCount++;
            else dCount++;
        }
        while (rCount > 0 && dCount > 0) {
            char curr = q.poll();
            if (curr == 'D') {
                if (dFloatingBan > 0) {
                    dFloatingBan--;
                    dCount--;
                } else {
                    rFloatingBan++;
                    q.add('D');
                }
            } else {
                if (rFloatingBan > 0) {
                    rFloatingBan--;
                    rCount--;
                } else {
                    dFloatingBan++;
                    q.add('R');
                }
            }
        }
        return rCount > 0 ? "Radiant" : "Dire";
    }
}
