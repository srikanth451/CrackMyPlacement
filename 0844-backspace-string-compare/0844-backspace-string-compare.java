class Solution {
    private String isEqual(String s)
    {
        int n = s.length();
        int hc = 0;
        StringBuilder ans = new StringBuilder();

        for(int i = n-1; i >= 0; i--)
        {
            if(s.charAt(i) == '#')
            {
                hc++;
                continue;
            }
            if(hc > 0)
            {
                hc--;
            }
            else{
           ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
    public boolean backspaceCompare(String s, String t) {
        return  isEqual(s).equals(isEqual(t));
    }
}