class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[] directions = {0, 1, 0, -1, 0}; // East, South, West, North
        int[][] result = new int[rows * cols][2];
        int steps = 0, direction = 0, len = 0;
        
        result[0] = new int[]{rStart, cStart};
        int count = 1;
        
        while (count < rows * cols) {
            if (direction == 0 || direction == 2) steps++; // Increase step size after moving East or West
            
            for (int i = 0; i < steps; i++) {
                rStart += directions[direction];
                cStart += directions[direction+1];
                
                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                    result[count++] = new int[]{rStart, cStart};
                }
                
                if (count == rows * cols) return result;
            }
            
            direction = (direction + 1) % 4; 
        }
        
        return result;
    }
}
