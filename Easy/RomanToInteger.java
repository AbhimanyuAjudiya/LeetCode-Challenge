import java.util.*;

class Solution {
    public int romanToInt(String s) {
        int sum=0;
        for(int i = 0;i<s.length();i++){
            char prev = (s.length() == 0) ? ' ' : s.charAt(i - 1);
            switch(s.charAt(i)){
                case 'I':
                    sum += 1;
                    break;
                case 'V':
                    sum = prev == 'I' ? + 3 : + 5;
                    break;
                case 'X':
                    sum = prev == 'I' ? + 8 : + 10;
                    break;
                case 'L':
                    sum = prev == 'X' ? + 30 : + 50;
                    break;
                case 'C':
                    sum = prev == 'X' ? + 80 : + 100;
                    break;
                case 'D':
                    sum = prev == 'C' ? + 300 : + 500;
                    break;
                case 'M':
                    sum = prev == 'C' ? + 800 : + 1000;
                    break;
                        
            }
        }
        return sum;
    }
}
