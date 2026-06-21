class Solution {
    public String decodeMessage(String key, String message) {
        char [] map = new char[26];
        char curr ='a';
        for(char ch:key.toCharArray()){
            if(ch!=' ' && map[ch-'a']==0){
                map[ch-'a']=curr;
                curr++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch:message.toCharArray()){
            if(ch==' '){
                sb.append(" ");
            }else{
                sb.append(map[ch-'a']);
            }
        }
        return sb.toString();
    }
}