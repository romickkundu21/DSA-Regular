class Solution {
    public int largestAltitude(int[] gain) {
        int alt=0;
        int res=0;
        for(int i=0;i<gain.length;i++){
            alt+=gain[i];
            res=Math.max(res,alt);
        }
        return res;
    }
}