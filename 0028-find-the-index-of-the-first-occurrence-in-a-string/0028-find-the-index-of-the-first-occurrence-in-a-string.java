class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<=haystack.length()-needle.length();i++){ // mid cond means that the possible length of
            int j=0;                                           // the subst starts at this index 
            while (j<needle.length() && haystack.charAt(i+j)==needle.charAt(j)){
                j++;
            }
            if(j==needle.length()){
                return i;
            }
        }
        return -1;
    }
}