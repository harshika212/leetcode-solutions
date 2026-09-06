class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int longest=0;
        for(int num:set){
            // to check if num is the beggining and theres no prior number in list
            if(!set.contains(num-1)){
               int current=num;
               int length=1;
               //increment current 
               while(set.contains(current+1)){
                current++;
                length++;

               }
               longest=Math.max(longest,length);

            }
        }
        return longest;
    }
}