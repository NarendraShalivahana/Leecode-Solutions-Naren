516. Longest Palindromic Subsequence
class Solution {
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i], -1);
        }
        return f(s,0,s.length()-1,dp);
    }
    public static int f(String s,int i,int j,int[][] dp){
        if(i>j){
            return 0;
        }
        if(i==j){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s.charAt(i)==s.charAt(j)){
            dp[i][j]=2+f(s,i+1,j-1,dp);
        }
        else{
            dp[i][j]=Math.max(f(s,i+1,j,dp),f(s,i,j-1,dp));
        }
        return dp[i][j];
    }
}
