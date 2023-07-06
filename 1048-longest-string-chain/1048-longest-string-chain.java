class Solution {
    public int longestStrChain(String[] words) {
        int count=0;
        Arrays.sort(words, (a,b)-> a.length()-b.length());
        HashMap<String,Integer> map=new HashMap<>();

        for(String word:words){
            map.put(word,1);
            for(int i=0;i<word.length();i++){
                StringBuilder newS=new StringBuilder(word);
                String str=newS.deleteCharAt(i).toString();
                if(map.containsKey(str)){
                    map.put(word,Math.max(map.get(word),map.get(str)+1));
                }
                
            }
            count=Math.max(count,map.get(word));
        }
        
        return count;
    }
}