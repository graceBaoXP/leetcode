package cn.graceBaoXP;

/**
 * Wildcard Matching
 *
 * Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for '?' and '*'.
 *
 * '?' Matches any single character.
 * '*' Matches any sequence of characters (including the empty sequence).
 */
public class Leet44 {

    public boolean isMatch(String s, String p) {

            boolean[][] dp=new boolean[s.length()+1][p.length()+1];
            dp[0][0]=true;
            for (int j=0;j<p.length();j++){
                if(dp[0][j]&&p.charAt(j)=='*'){
                    dp[0][j+1]=true;
                }
            }

            for(int i=0;i<s.length();i++){
                for (int j=0;j<p.length();j++){
                    if(p.charAt(j)=='*'){
                        dp[i+1][j+1]=dp[i][j+1]||dp[i+1][j];
                    }else if (p.charAt(j)=='?'||p.charAt(j)==s.charAt(i)){
                        dp[i+1][j+1]=dp[i][j];
                    }
                }
            }
            return  dp[s.length()][p.length()];

    }
}
