class Solution {
    public boolean checkRecord(String s) {
        int count1=0;
        int count2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                count1++;
            }
        }
        if(count1>=2 || s.contains("LLL")){
            return false;
        }
        return true;
    }
}