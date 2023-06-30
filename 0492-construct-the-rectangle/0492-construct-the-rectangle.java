class Solution {
    public int[] constructRectangle(int area) {
        int w=(int)Math.sqrt(area);

        while(area%w!=0){
            w--;
        }
        int l=(int)Math.ceil(area/w);
        int[] res={l,w};
        return res;
    }
}