class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        res.add(new ArrayList<>());
        for(int i=0;i<nums.length;i++){
            int size=res.size();
            for(int j=0;j<size;j++){
                List<Integer> arr=new ArrayList<>(res.get(j));
                arr.add(nums[i]);
                res.add(arr);
            }
        }
        return res;
    }
}