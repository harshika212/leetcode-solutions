class Solution {
    public int maxVowels(String s, int k) {
        String vowels="aeiouAEIOU";
        int vowelc=0;
        for(int i=0;i<k;i++){
           if(vowels.indexOf(s.charAt(i))!=-1){
            vowelc++;
           }
        }
        int maxvowelc=vowelc;
        for(int i=k;i<s.length();i++){

            if(vowels.indexOf(s.charAt(i))!=-1){
                vowelc++;
            
            }
            if(vowels.indexOf(s.charAt(i-k))!=-1){
                vowelc--;
            }
            maxvowelc=Math.max(maxvowelc,vowelc);
        }
        return maxvowelc;

    }
}