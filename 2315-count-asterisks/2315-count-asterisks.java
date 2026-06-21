class Solution {
    public int countAsterisks(String s) {
        int pipes=0;
        int count=0;
        for(char ch:s.toCharArray()){
            if( ch=='|'){
                pipes++;
            }
            else if(ch=='*' && pipes%2==0){
                count++;
            }

        }
        return count;
    }
}