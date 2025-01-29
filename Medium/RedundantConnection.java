class Solution {
    class DSU {
        private int N;
        private int[] size;
        private int[] representative;

        public DSU(int N) {
            this.N = N;
            size = new int[N];
            representative = new int[N];

            for (int node = 0; node < N; node++) {
                size[node] = 1;
                representative[node] = node;
            }
        }
        public int find(int node) {
            if (representative[node] == node) {
                return node;
            }

            return representative[node] = find(representative[node]);
        }
        public boolean doUnion(int nodeOne, int nodeTwo) {
            nodeOne = find(nodeOne);
            nodeTwo = find(nodeTwo);

            if (nodeOne == nodeTwo) {
                return false;
            } else {
                if (size[nodeOne] > size[nodeTwo]) {
                    representative[nodeTwo] = nodeOne;
                    size[nodeOne] += size[nodeTwo];
                } else {
                    representative[nodeOne] = nodeTwo;
                    size[nodeTwo] += size[nodeOne];
                }
                return true;
            }
        }
    }

    public int[] findRedundantConnection(int[][] edges) {
        int N = edges.length;

        DSU dsu = new DSU(N);
        for (int[] edge : edges) {
            if (!dsu.doUnion(edge[0] - 1, edge[1] - 1)) {
                return edge;
            }
        }
        return new int[] {};
    }
}
