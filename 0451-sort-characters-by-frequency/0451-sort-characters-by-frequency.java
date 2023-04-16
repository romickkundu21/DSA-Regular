class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> res=new HashMap<>();

				for(char c: s.toCharArray()){
					res.put(c,res.getOrDefault(c,0)+1);
				}

				List<Character> chars=new ArrayList(res.keySet());
				Collections.sort(chars, (a,b)->(res.get(b)-res.get(a)));

				StringBuilder sb=new StringBuilder();

				for(Object c:chars){
					for(int i=0;i<res.get(c);i++){
						sb.append(c);
					}
				}

				return sb.toString();
    }
}