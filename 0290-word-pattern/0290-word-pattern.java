class Solution {
    public boolean wordPattern(String pattern, String s) {
        //if(pattern.length() != words.length) return false;
        HashMap<Character,String> map=new HashMap<>();
        HashSet <String> usedwords = new HashSet<>();
        String [] words=s.split(" ");
        if(pattern.length() != words.length) return false;
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            String word = words[i];
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(word)) 
                    return false;
            }
            else{
                    if(usedwords.contains(word)) return false;
                    
                }
                map.put(ch,word);
            usedwords.add(word);

            
            // map.put(ch,word);
            // usedwords.add(word);
            
        }
        return true;
    }
}