class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        for(int i:nums1){
            s1.add(i);
        }
        for(int i:nums2){
            s2.add(i);
        }
        List<List<Integer>> res=new ArrayList<>();
        res.add(new ArrayList());
        res.add(new ArrayList());

        for(int i:s1){
            if(!s2.contains(i)){
                res.get(0).add(i);
            }
        }
        for(int i:s2){
            if(!s1.contains(i)){
                res.get(1).add(i);
            }
        }

        return res;
    } 
}