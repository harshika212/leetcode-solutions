class Solution {
    public String toGoatLatin(String sentence) {
        String [] words = sentence.split(" ");
        String vowels="aeiouAEIOU";
        StringBuilder sb= new StringBuilder ();
        for(int i=0;i<words.length;i++){
            String word = words[i];
            if(vowels.indexOf(word.charAt(0))!=-1){
                sb.append(word);
            }else{
                sb.append(word.substring(1));
                sb.append(word.charAt(0));
            }
            sb.append("ma");
            for(int j=0;j<=i;j++){
                sb.append("a");
            }
            if(i!=words.length-1){
                sb.append(" ");
            }
          }
        
       return sb.toString(); 
    }
}