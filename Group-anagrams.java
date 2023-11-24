class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> helper = new HashMap<>();

        for(String str: strs) {

            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            helper.putIfAbsent(sortedWord, new ArrayList<>());

            if(helper.containsKey(sortedWord)) {
                helper.get(sortedWord).add(str);
            }
        }

        return new ArrayList<>(helper.values());
        
    }
}
//LEETCODE
