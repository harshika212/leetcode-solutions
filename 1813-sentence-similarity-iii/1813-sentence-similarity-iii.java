class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String [] a= sentence1.split(" ");
        String [] b=sentence2.split(" ");
        if( a.length<b.length ){
        String [] temp =a; // this is bec the two pointer logic is based around the concept that 
        a=b;              // the b string is smaller theref if b is bigger str, swap it
        b=temp;
        }
        int left=0;
        while(left<b.length && a[left].equals(b[left])){
            left++;
        }
        int right=0;
        while(right<b.length-left && a[a.length-1-right].equals(b[b.length-1-right])){
            right++;
        }
        return left+right==b.length;
    }
}