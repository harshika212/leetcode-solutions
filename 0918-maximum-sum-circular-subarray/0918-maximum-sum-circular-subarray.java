class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currmax=0;
        int maxsum=nums[0];
        int currmin=0;
        int minsum=nums[0];
        int total=0;
        for(int num:nums){
            currmax=Math.max(num,currmax+num);
            maxsum=Math.max(maxsum,currmax);
            
            currmin=Math.min(num,currmin+num);
            minsum=Math.min(minsum,currmin);

            total+=num;
        }
          if(maxsum<0){
            return maxsum;
          }
         return Math.max(maxsum,total-minsum);   
        }
       
    }
