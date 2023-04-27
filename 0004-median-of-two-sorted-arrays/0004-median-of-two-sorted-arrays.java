class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int res[]=new int[n+m];
        for(int i=0;i<n;i++){
            res[i]=nums1[i];
        }
        for(int i=0;i<m;i++){
            res[n+i]=nums2[i];
        }
        Arrays.sort(res);
        int mid=res.length/2;
        if(res.length%2==0){
            return (res[mid]+res[mid-1])/2.0;
        }
        return res[res.length/2];
        
    }
}