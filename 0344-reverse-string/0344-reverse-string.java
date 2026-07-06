class Solution {
    public void reverseString(char[] s) {
        reverseStringsoln(s,0,s.length-1);
    }
    static char[] reverseStringsoln(char[] s,int left,int right){
        if(left>=right) return s;
        char temp= s[left];
        s[left] = s[right];
        s[right] = temp;
        return reverseStringsoln(s,left+1,right-1);
    }
}