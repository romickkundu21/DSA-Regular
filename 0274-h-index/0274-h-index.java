class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        // int low=0;
        // int high=n-1;
        // int res=0;
        // while(low<=high){
        //     int mid=(low+high)/2;
        //     if(citations[mid]>=n-mid){
        //         res=n-mid;
        //         high=mid-1;
        //     }else{
        //         low=mid+1;
        //     }
        // }
        // return res;
        if(n==0 || citations==null)return 0;
        Arrays.sort(citations);
        int len=n;
        for(int i=0;i<n;i++){
            if(len<=citations[i]){
                return len;
            }else{
                len--;
            }
        }
        return len;
    }
}