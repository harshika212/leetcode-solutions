class Solution {
    public int percentageLetter(String s, char letter) {
        int count=0;
        for(int i=0;i<s.length();i++){
        char t = s.charAt(i);
        if(t==letter){
            count++;
        }
        }
        return (count*100)/s.length();

    }
}