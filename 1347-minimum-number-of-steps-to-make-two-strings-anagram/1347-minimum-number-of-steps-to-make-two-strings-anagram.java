class Solution {
    public int minSteps(String s, String t) {
        int [] freq = new int[26];
        int count=0;
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            freq[ch-'a']--;
        }
        for(int num:freq){
            if(num>0){
                count+=num;
            }
        }
        return count;
    }
}