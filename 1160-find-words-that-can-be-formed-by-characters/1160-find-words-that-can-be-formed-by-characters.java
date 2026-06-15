class Solution {
    public int countCharacters(String[] words, String chars) {
        int ans=0;
        int [] freq=new int[26];
        for(char ch:chars.toCharArray()){
            freq[ch-'a']++;
        }
        for(String word:words){
            int [] temp = freq.clone();
            int i=0;
            for(i=0;i<word.length();i++){
                char ch=word.charAt(i);
                temp[ch-'a']--;
                if(temp[ch-'a']<0) break;
            }
            if(i==word.length()){
                ans+=word.length();
            }
        }
        return ans;
    }
}