class Solution {
    public String longestCommonPrefix(String[] strs) {
        
         int n = strs.length;
         
         Arrays.sort(strs);
         StringBuilder ans = new StringBuilder();
         int i=0;
         while(i < strs[0].length())
         {
            if(strs[0].charAt(i) != strs[n-1].charAt(i))
            {
                return ans.toString();
            }
            ans.append(strs[0].charAt(i));
            i++;
         }
         return ans.toString();

         
    }
}