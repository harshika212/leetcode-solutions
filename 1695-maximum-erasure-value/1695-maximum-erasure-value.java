class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        int sum=0;
        int left=0;
        int maxsum=0;
        for(int right=0;right<nums.length;right++){
            while(set.contains(nums[right])){
                sum-=nums[left];
                set.remove(nums[left]);
                left++;
            }

        set.add(nums[right]);
        sum+=nums[right];
        maxsum= Math.max(maxsum,sum);
        }
        return maxsum;
    }
}