class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q= new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.add(i);
        }
        while(q.size()!=1){
            int l=k;
            while(l!=1){
                int v=q.peek();
                q.remove();
                q.add(v);
                l--;
            }
            q.remove();
        }

        return q.peek();
    }
}