class Solution {
    public int hammingDistance(int x, int y) {
        int count=0;
        String s=Integer.toBinaryString(x^y);
        for(char i:s.toCharArray()){
            if(i=='1'){
                count++;
            }
        }
        return count;
    }
}