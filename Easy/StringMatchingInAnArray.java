class Solution {
    public List<String> stringMatching(String[] words) {
        int n = words.length;
        HashSet<String> ans = new HashSet<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j) continue;
                if(words[i].contains(words[j])) ans.add(words[j]);
            }
        }
        return new ArrayList<>(ans);
    }
}
