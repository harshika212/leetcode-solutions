class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start = 1;
        int end = 0;

        // find max element
        for(int num : nums) {
            end = Math.max(end, num);
        }

        int ans = end;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            int sum = 0;

            
            for(int num : nums) {
                sum += (num + mid - 1) / mid;
            }

            if(sum <= threshold) {
                ans = mid;
                end = mid - 1; 
            }

            else {
                start = mid + 1; 
            }
        }

        return ans;
    }
}