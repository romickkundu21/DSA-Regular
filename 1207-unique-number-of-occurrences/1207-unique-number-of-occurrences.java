class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> res=new HashMap<>();
        for(int i:arr){
            res.put(i,res.getOrDefault(i,0)+1);
        }
        Set<Integer> set=new HashSet<Integer>(res.values());
        return res.size()==set.size();
    }
}