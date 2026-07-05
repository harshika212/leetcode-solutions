class Solution {
    public int missingNumber(int[] nums) {
         HashSet<Integer> set = new HashSet<>();

        // Store all numbers in the set
        for (int num : nums) {
            set.add(num);
        }

        // Check from 0 to n
        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return -1; // This line is ne
    }
}