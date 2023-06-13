class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int answer[]=new int[n];

        Stack<Integer> s=new Stack<>();

        for(int i=0;i<n;i++){
            while(!s.isEmpty() && temperatures[i]>temperatures[s.peek()]){
                int id=s.pop();
                answer[id]=i-id;
            }
            s.push(i);
        }

        return answer;
    }
}