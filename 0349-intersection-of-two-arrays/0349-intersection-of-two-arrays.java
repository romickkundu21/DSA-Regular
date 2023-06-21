class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1=new HashSet<>();
        Set<Integer> res=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            s1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(s1.contains(nums2[i])){
                res.add(nums2[i]);
            }
        }
        int inter[]=new int[res.size()];
        int i=0;
        for(Integer j: res){
            inter[i++]=j;
        }
        return inter;
    }
}