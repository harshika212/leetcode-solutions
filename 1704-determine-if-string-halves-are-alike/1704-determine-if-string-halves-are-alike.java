class Solution {
    public boolean halvesAreAlike(String s) {
        int left=0;
        int right=0;
        String vowels="aeiouAEIOU";
        int mid = s.length()/2;
        for(int i=0;i<mid;i++){
            if(vowels.indexOf(s.charAt(i))!=-1){
                left++;
            }
        }
        for(int i=mid;i<s.length();i++){
            if(vowels.indexOf(s.charAt(i))!=-1){
                right++;
            }
        }
        return left==right;
    }
}