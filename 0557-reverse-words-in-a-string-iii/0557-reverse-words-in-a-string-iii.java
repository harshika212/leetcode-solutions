class Solution {
    public String reverseWords(String s) {
        String [] word= s.split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<word.length;i++){
            StringBuilder temp = new StringBuilder(word[i]);
            ans.append(temp.reverse());
            if(i!=word.length-1){
                ans.append(" ");
            }
        }return ans.toString();

        
    
    }
}