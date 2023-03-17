class Trie {
    HashSet<String> hs;
    public Trie() {
        hs=new HashSet<>();
    }
    
    public void insert(String word) {
        hs.add(word);
    }
    
    public boolean search(String word) {
        if(hs.contains(word))
            return true;
        return false;
    }
    
    public boolean startsWith(String prefix) {
        for(String it:hs){
            if(it.startsWith(prefix))
                return true;
        }
        return false;
    }
}
/**
 * Your Trie object will be instantiated and called as such:
 * Trie* obj = new Trie();
 * obj->insert(word);
 * bool param_2 = obj->search(word);
 * bool param_3 = obj->startsWith(prefix);
 */
