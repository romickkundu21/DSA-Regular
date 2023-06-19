class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int res=0;
        for(int i=1;i<=mainTank;i++){
            if(i%5==0 && additionalTank!=0){
                res+=10;
                mainTank++;
                additionalTank--;
            }else{
                res+=10;
            }
        }
        return res;
    }
}