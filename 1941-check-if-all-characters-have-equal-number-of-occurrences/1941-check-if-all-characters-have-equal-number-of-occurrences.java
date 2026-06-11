class Solution {
    public boolean areOccurrencesEqual(String s) {
        int [] freq = new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        int target = 0;
        for(int count:freq){
            if(count!=0){
                target=count;
                break;
            }
        }
        for(int count:freq){
            if(count!=0 && count!=target){
                return false;
            }
        }
        return true;
    }
}