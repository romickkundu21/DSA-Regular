class Solution {
    public int candy(int[] ratings) {
        int sum=0;
        int n=ratings.length;
        int res[]=new int[n];

        for(int i=0;i<n;i++){
            res[i]=1;
        }
        for(int i=0;i<n-1;i++){
            if(ratings[i]<ratings[i+1]){
                res[i+1]=res[i]+1;
            }
        }

        for(int i=n-1;i>0;i--){
            if(ratings[i-1]>ratings[i]){
                if(res[i-1]<(res[i]+1)){
                    res[i-1]=res[i]+1;
                }
            }
        }

        for(int i=0;i<n;i++){
            sum+=res[i];
        }

        return sum;
    }
}