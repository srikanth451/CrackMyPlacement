class Solution {
    public int strStr(String haystack, String needle) {
        
        int n = haystack.length();
        int m = needle.length();

        int i=0; 
        while(i <= n-m)
        {
               int j = 0;
            int k =  i;
            while(j < m)
            {
                if(haystack.charAt(k) != needle.charAt(j))
                {
                    break;
                }
                j++;
                k++;
                if(j == m) return i;
            }
            i++;
        }
        return -1;
    }
}