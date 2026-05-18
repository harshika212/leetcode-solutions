class Solution {
    public int largestAltitude(int[] gain) {
        int current=0;
        int maxAlt=0;
        for(int i=0;i<gain.length;i++){
            current += gain[i];
            maxAlt= Math.max(maxAlt,current);
        }
        
        return maxAlt;

    }
}