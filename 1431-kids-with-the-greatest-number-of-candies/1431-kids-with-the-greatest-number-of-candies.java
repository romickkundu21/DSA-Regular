class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxC = 0;
        for (int i : candies) {
            maxC = Math.max(maxC, i);
        }
        
        List<Boolean> res = new ArrayList<>();
        
        for (int i : candies) {
            if (i + extraCandies >= maxC) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        
        return res;
    }
}