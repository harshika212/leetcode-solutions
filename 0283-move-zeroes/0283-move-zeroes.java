class Solution {
    public void moveZeroes(int[] nums) {
        int slow=0;
        for(int fast=0;fast<=nums.length-1;fast++){
            if(nums[fast]!=0){
                int temp=nums[slow];
                nums[slow]=nums[fast];
                nums[fast]=temp;
                slow++;
            }
        
        }
    }
}