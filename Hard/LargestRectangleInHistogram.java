class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int prevSmall[] = new int[heights.length];
        int nextSmall[] = new int[heights.length];

        //Next small
        Stack<Integer> s = new Stack<>();
        for(int i = heights.length -1; i >= 0; i--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nextSmall[i] = heights.length;
            } else {
                nextSmall[i] = s.peek();
            }

            s.push(i);
        }
        //prev small
        s = new Stack<>(); 
        for(int i = 0; i < heights.length; i++){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }

            if(s.isEmpty()){
                prevSmall[i] = -1;
            } else {
                prevSmall[i] = s.peek();
            }
            s.push(i);
        }
        //find are
        for (int j = 0; j < heights.length; j++) {
            int height = heights[j];
            int width = nextSmall[j] - prevSmall[j] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }
        return maxArea;
    }
}
