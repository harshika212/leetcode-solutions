class Solution {
    public int countGoodSubstrings(String s) {
        int good=0;
        for(int i=0;i<=s.length()-3;i++){//condition is for i+2 to not go OfB
        if( s.charAt(i)!=s.charAt(i+1)&& s.charAt(i)!=s.charAt(i+2)&&s.charAt(i+1)!=s.charAt(i+2)){
            good++;
            }              
        }
            
        return good;
    }
}