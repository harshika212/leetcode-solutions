class Solution {
    public int arrangeCoins(int n) {
        int low=1; int high=n;
        int ans=0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isPossible(mid,n)){
                ans = mid;
                low = mid+1;
            }else{
                high = mid - 1;
            }
           }
           return ans;
        }
        static boolean isPossible(int mid,int n){
            long coinsneeded = (long) mid * (mid+1)/2;
            return coinsneeded <= n;

        }
    }
