class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }
        int[] freq= new int[26];
        for(char ch : sentence.toCharArray()){
            freq[ch - 'a']++;
        }
        for(int num:freq){
            if(num==0){
                return false;
            }
        }
        return true;
    }
}