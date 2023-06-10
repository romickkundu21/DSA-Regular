class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] seen=new boolean[rooms.size()];
        seen[0]=true;

        Stack<Integer> keys=new Stack();
        keys.push(0);

        while(!keys.isEmpty()){
            int currentKey=keys.pop();
            for(int key:rooms.get(currentKey)){
                if(!seen[key]){
                    seen[key]=true;
                    keys.push(key);
                }
            }
        }

        for(boolean seen_yet:seen){
            if(!seen_yet)return false;
        }
        return true;
    }
}