class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];

        int left=0;
        int right=n-1;
        int k=n-1;
        while(left<=right){
            int leftSq = nums[left]*nums[left];
            int rightSq = nums[right]*nums[right];
             if(leftSq > rightSq){
            ans[k] = leftSq;
            left++;
            } else{
            ans[k] = rightSq;
            right--;
        } k--;

      }return ans;
    }
}