class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int left=0;
        int right= ch.length-1;
        while(left<right){
        while(left<right && "aeiouAEIOU".indexOf(ch[left])==-1){            
            left++;
        }
        while(left<right && "aeiouAEIOU".indexOf(ch[right])==-1){
            right--;
        }
        char temp = ch[left];
        ch[left] = ch[right];
        ch[right] = temp;
        left++;
        right--;
        } 
        return new String (ch);
        }
    }
