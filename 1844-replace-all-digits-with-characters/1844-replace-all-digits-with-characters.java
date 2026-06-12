class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                sb.append(s.charAt(i));
            }else{
                int shift=s.charAt(i)-'0';
                char next=(char)(s.charAt(i-1)+shift);
                sb.append(next);
            }

        }
        return sb.toString();
    }
}