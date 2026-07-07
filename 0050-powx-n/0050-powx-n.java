class Solution {
    public double myPow(double x, int n) {
        if(x<=0){
            Math.abs(x);
        }
        return Math.pow(x,n);
    }
}