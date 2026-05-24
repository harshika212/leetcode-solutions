class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        //map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
               int prevind = map.get(nums[i]);
               if(i-prevind<=k){
                return true;
               }
            }
        
        map.put(nums[i],i);
        }
        return false;
    }
}