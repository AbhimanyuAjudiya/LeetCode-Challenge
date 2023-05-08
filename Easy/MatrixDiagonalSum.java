class Solution {
    public int diagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum+=matrix[i][i]; //PD - Primary Diagonal

            if (i != matrix.length-i-1) { // by this condition the center element will not added twice
                sum+= matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
}
