public class longestCommonSubsequence {
    public static void main(String[] args) {
       String text1 = "abcde", text2 = "ace";
        System.out.println(longestCommonSubsequenceRecursive(text1,text2));
        System.out.println(longestCommonSubsequenceDP(text1,text2));

    }

    public static int longestCommonSubsequenceRecursive(String text1, String text2) {
        Integer [][] dp = new Integer [text1.length()][text2.length()];
        return count(text1, text2, text1.length()-1, text2.length()-1, dp);
    }
    public static int count(String text1, String text2, int len1, int len2, Integer [][] dp) {
        if(len1 < 0 || len2 < 0)
            return 0;
        if(dp[len1][len2] != null)
            return dp[len1][len2];
        if(text1.charAt(len1) == text2.charAt(len2))
            return dp[len1][len2] = 1 + count(text1.substring(0,len1), text2.substring(0,len2), len1-1, len2-1, dp);
        else
            return dp[len1][len2] = Math.max(count(text1.substring(0, len1), text2, len1-1, len2, dp), count(text1, text2.substring(0,len2), len1, len2-1,dp));
    }


    public static int longestCommonSubsequenceDP(String text1, String text2) {
        int [][] dp = new int [text1.length()+1][text2.length()+1];
        for(int i=1;i<dp.length;i++) {
            for(int j=1;j<dp[0].length;j++) {
                if(text1.charAt(i-1) == text2.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[text1.length()][text2.length()];
    }
}
