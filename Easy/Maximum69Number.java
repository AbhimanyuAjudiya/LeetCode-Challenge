class Solution {
    public int maximum69Number (int num) {
        int temp = num;
        int i = 0;
        int idx = 0;
        while(temp > 0){
            i++;
            int digit = temp % 10;
            temp /= 10;
            if(digit == 6){
                idx = i;
            } 
        }
        return num + 3 * (int)Math.pow(10, idx - 1);
        // return Integer.parseInt(String.valueOf(num).replaceFirst("6","9"));
    }
}
