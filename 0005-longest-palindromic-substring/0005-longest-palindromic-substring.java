class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n<2) return s;
        boolean dp[][] = new boolean[n][n];
        for(int i=0;i<n;i++){
          dp[i][i]=true;
        }
        for(int k=2;k<=n;k++){
          for(int i=0;i<n-k+1;i++){
            int j = i+k-1;
            dp[i][j]=(s.charAt(i)==s.charAt(j)) && (k==2 || dp[i+1][j-1]);
          }
        }
        String lon="";
        int mx=0;
        for(int i=0;i<n;i++){
          for(int j=i;j<n;j++){
           if(dp[i][j] && lon.length()< j-i+1){
             lon=s.substring(i,j+1);
             mx=j-i+1;
           } 
          }
        }
        return lon;
    }
}