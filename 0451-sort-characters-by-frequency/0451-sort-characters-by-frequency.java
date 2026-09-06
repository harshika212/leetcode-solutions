class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        ArrayList <Character> list = new ArrayList<>(map.keySet());
        list.sort((a,b) -> map.get(b)-map.get(a));
        StringBuilder ans=new StringBuilder();
        for(char c:list){
            for(int i=0;i<map.get(c);i++){
                ans.append(c);
            }

        }
        return ans.toString();
    }
}