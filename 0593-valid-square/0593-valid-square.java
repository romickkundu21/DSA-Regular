class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer> res=new HashSet<>();
        if(!helper(p1,p2,res) || !helper(p1,p3,res) || !helper(p1,p4,res) || !helper(p2,p3,res) || !helper(p2,p4,res) || !helper(p3,p4,res)){
            return false;
        }
        return res.size()==2?true:false;
    }

    boolean helper(int[] s, int[] e, Set<Integer> res){
        if(s[0]==e[0] && e[1]==s[1])return false;

        int dx=s[0]-e[0];
        int dy=s[1]-e[1];
        int dist=dx*dx+dy*dy;
        res.add(dist);
        return true;
    }
}