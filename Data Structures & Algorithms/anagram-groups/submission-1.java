class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // initialize hashmap: store the frequency of letters
        // sort the letters, then iterate all the letters
        // if the letter has the same frequency, group them together
        // in a list
        List<List<String>> res = new ArrayList<>();

        // key is the sorted, value is all the other elements in the list

        Map<String, List<String>> groupings = new HashMap<>();

        for (String ele:strs){
            // convert into character array, then sort, then reverse back in heap
            char[] eleChars = ele.toCharArray();
            Arrays.sort(eleChars);
            String s = new String(eleChars);

            // settle the key first, if it already exists, append to the value
            //if not add it in as a new array
            if (!groupings.containsKey(s)){
                groupings.put(s, new ArrayList<>());
            }
            groupings.get(s).add(ele);
        }

        groupings.forEach((k,v) -> {
            res.add(v);
        });
        return res;
    
    }
}
