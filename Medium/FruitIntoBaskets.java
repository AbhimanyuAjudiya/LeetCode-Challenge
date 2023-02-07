class Solution {
    public int totalFruit(int[] fruits) {
        int last_fruit = -1;
        int second_last_fruit = -1;
        int last_fruit_count = 0;
        int curr_max = 0;
        int max = 0;

        for(Integer fruit : fruits){
            if(fruit == last_fruit || fruit == second_last_fruit){
                curr_max++;
            } else {
                curr_max = last_fruit_count + 1;
            }

            if(fruit == last_fruit){
                last_fruit_count++;
            } else {
                last_fruit_count = 1;
            }

            if(fruit != last_fruit){
                second_last_fruit = last_fruit;
                last_fruit = fruit;
            }

            max = Math.max(max, curr_max);
        }
        return max;
    }
}
