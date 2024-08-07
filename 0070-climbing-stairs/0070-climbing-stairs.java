class Solution {
    public int f(int n, int[] dp)
    {
        if(n == 0 || n== 1)
        {
           return 1;
        }
        if(dp[n] != -1)
        {
            return dp[n];
        }
        int left = f(n-1,dp);
        int right = f(n-2,dp);
        return dp[n] = left + right;
    }
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);

        return f(n,dp);
    }
}