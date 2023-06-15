class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int zeros=0;
        int ones=0;
        for(int i:students){
            if(i==0)zeros++;
            else ones++;
        }

        for(int i:sandwiches){
            if(i==0){
                if(zeros==0){
                    return ones;
                }else zeros--;
            }
            else{
                if(ones==0){
                    return zeros;
                }else ones--;
            }
        }
        return 0;
    }
}