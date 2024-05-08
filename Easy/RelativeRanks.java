class Solution {
    public String[] findRelativeRanks(int[] score) {
        int lenScore = score.length;
        List<String> ans = new ArrayList<>(Collections.nCopies(lenScore, ""));
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(b[0], a[0]);
            }
        });

        String[] rank = { "Gold Medal", "Silver Medal", "Bronze Medal" };

        for (int index = 0; index < score.length; index++) {
            maxHeap.add(new int[] { score[index], index });
        }

        int number = 1;
        while (!maxHeap.isEmpty()) {
            int[] top = maxHeap.poll();
            int index = top[1];
            if (number < 4) {
                ans.set(index, rank[number - 1]);
            } else {
                ans.set(index, String.valueOf(number));
            }
            number++;
        }
        String[] answer = new String[ans.size()];
        answer = ans.toArray(answer);
        return answer;
    }
}
