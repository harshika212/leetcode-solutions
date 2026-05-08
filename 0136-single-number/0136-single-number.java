class Solution {
    public int singleNumber(int[] nums) {
        int i=0;{
        Arrays.sort(nums);

        while(i<nums.length-1){
            if(nums[i]!=nums[i+1]){
                return nums[i];
                }
                i+=2;
            }

        
        return nums[nums.length-1];
    }
}
}