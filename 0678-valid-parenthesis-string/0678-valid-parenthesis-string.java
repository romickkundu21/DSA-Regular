class Solution {
    public boolean checkValidString(String s) {
        int n=s.length();
        int cmax=0,cmin=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                cmax++;
                cmin++;
            }else if(s.charAt(i)==')'){
                cmax--;
                cmin--;
            }else if(s.charAt(i)=='*'){
                cmax++;
                cmin--;
            }
            if(cmax<0)return false;
            if(cmin<0){
                cmin=0;
            }
        }
        return cmin==0;
    }
}