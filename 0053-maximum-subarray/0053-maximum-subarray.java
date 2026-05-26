class Solution {
    public int maxSubArray(int[] nums) {
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int num:nums){
            currsum+=num;
            maxsum=Math.max(maxsum,currsum);
        
        
           if(currsum<0){
            currsum=0;
           }
         }
        return maxsum;
    }
}