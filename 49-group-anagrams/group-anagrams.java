class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();

        for(String s : strs){
            char[] as = s.toCharArray();
            Arrays.sort(as);
            String key = String.valueOf(as);

            List<String> li = mp.getOrDefault(key, new ArrayList<>());
            li.add(s);
            mp.put(key, li);
        }

        List<List<String>> list = new ArrayList<>();
        for(Map.Entry<String, List<String>> en : mp.entrySet()){
            list.add(en.getValue());
        }
        return list;
    }
}