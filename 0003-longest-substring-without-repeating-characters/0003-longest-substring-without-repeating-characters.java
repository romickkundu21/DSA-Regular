class Solution {
    public int lengthOfLongestSubstring(String s) {
        int a_pointer=0;
        int b_pointer=0;
        int max=0;
        HashSet<Character> res=new HashSet<>();

        while(b_pointer<s.length()){
            if(!res.contains(s.charAt(b_pointer))){
                res.add(s.charAt(b_pointer));
                b_pointer++;
                max=Math.max(max,res.size());
            }else{
                res.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }
        return max;
    }
}