class Solution {
    public String restoreString(String s, int[] indices) {
        char[] carr=s.toCharArray(),carr1=new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            carr1[indices[i]]=carr[i];
        }
        return String.valueOf(carr1);
    }
}