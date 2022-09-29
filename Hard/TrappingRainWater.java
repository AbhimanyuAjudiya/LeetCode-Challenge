public static int TrappingRainwater(int height[]){ //Time complexity = O(n)
    int n = height.length;
    // calculate left max boundary - array
    int leftMax[] = new int[n];
    leftMax[0] = height[0];
    for (int i = 1; i < n; i++) {
        leftMax[i] = Math.max(height[i], leftMax[i - 1]);// Every time we are Comparing the number with last number so (i - 1)
    }

    // calculate right max boundary - array
    int rightMax[] = new int[n];
    rightMax[n - 1] = height[n - 1];
    for (int i = n-2; i >= 0; i--) {
        rightMax[i] = Math.max(height[i], rightMax[i + 1]);// Every time we are comparing the number with frount number so (i + 1)
    }


    int trapedWater = 0;
    //run a loop
    for (int i = 0; i < rightMax.length; i++) {
        //waterLevel = min(leftMax boundary, rightMax boundary)
        int waterLevel = Math.min(leftMax[i], rightMax[i]);

        //trapedWater = waterLevel - height[i]
        trapedWater += waterLevel - height[i];
    }
    return trapedWater;
}
