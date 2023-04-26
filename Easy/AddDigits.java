class Solution {
    public int addDigits(int num) {
        while (num > 9) {
            int n = (num % 10);
            num -= n;
            num /= 10;
            num = n + num;
        }
        return num;
    }
}
