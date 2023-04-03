class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);  // sort the people in non-decreasing order
        int i = 0, j = people.length - 1, boats = 0;
        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++;  // move the lightest pointer towards the center
            }
            j--;  // move the heaviest pointer towards the center
            boats++;  // increment the boat count
        }
        return boats;
    }
}
