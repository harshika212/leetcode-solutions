class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = find(nums, target, true);
        int last = find(nums, target, false);
        return new int[]{first, last};
    }

      int find(int[] nums, int target, boolean findFirst) {
        int start = 0, end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid; // found target

                if (findFirst) {
                    end = mid - 1;   // move left
                } else {
                    start = mid + 1; // move right
                }
            }
        }
        return ans;
      }
}