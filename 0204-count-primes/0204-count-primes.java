class Solution {
    public int countPrimes(int n) {
        boolean[] res=new boolean[n];
        int count=0;
        for(int i=2;i<n;i++){
            if(res[i])continue;
            count++;
            for(long j=(long)i*i;j<n;j+=i){
              res[(int)j]=true;
            }
          
        }
        
        return count;
    }
}