class Solution {
    public String removeDigit(String number, char digit) {
        List<String> res=new ArrayList<>();
        for(int i=0;i<number.length();i++){
            if(digit==number.charAt(i)){
                res.add(number.substring(0,i)+number.substring(i+1));
            }
        }
        Collections.sort(res);
        return res.get(res.size()-1);
    }
}