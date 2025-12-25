class RandomizedSet {

    LinkedHashSet<Integer> st;

    public RandomizedSet() {
        st= new LinkedHashSet<>();
    }
    
    public boolean insert(int val) {
        boolean r = st.contains(val);
        st.add(val);
        return !r;
    }
    
    public boolean remove(int val) {
        return st.remove(val);
    }
    
    public int getRandom() {
        Random rand = new Random();
        ArrayList<Integer> at = new ArrayList<>(st);
        return at.get(rand.nextInt(st.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */