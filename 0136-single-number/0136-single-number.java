class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            Arrays.sort(nums);

            while(i<nums.length-1){
                if(nums[i]!=nums[i+1]){
                    return nums[i];
                }
                i+=2;
            }

        }
        return nums[nums.length-1];
    }
}