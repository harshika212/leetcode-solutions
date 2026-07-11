class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs) {

            int[] freq = new int[26];

            for(char ch : str.toCharArray()) {
                freq[ch - 'a']++;
            }

            StringBuilder key = new StringBuilder();

            for(int num : freq) {
                key.append(num).append("#");
            }

            if(!map.containsKey(key.toString())) {
                map.put(key.toString(), new ArrayList<>());
            }

            map.get(key.toString()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}