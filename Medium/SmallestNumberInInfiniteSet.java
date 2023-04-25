class SmallestInfiniteSet {
    private SortedSet<Integer> addedIntegers;
    private Integer currentInteger;
    
    public SmallestInfiniteSet() {
        addedIntegers = new TreeSet<>();
        currentInteger = 1;
    }
    
    public int popSmallest() {
        int answer;
        if (!addedIntegers.isEmpty()) {
            answer = addedIntegers.first();
            addedIntegers.remove(answer);
        } 
        else {
            answer = currentInteger;
            currentInteger += 1;
        }
        return answer;
    }
    
    public void addBack(int num) {
        if (currentInteger <= num || addedIntegers.contains(num)) {
            return;
        }
        addedIntegers.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
