class Solution {
    private Boolean[][] memo;

    public boolean isMatch(String s, String p) {
        memo = new Boolean[s.length()+1][p.length()+1];
        return dp(0, 0, s, p);
    }

    private boolean dp(int i, int j, String str, String ptrn){
        if(memo[i][j] != null){
            return memo[i][j];
        }

        if(j == ptrn.length()){
            return i == str.length();
        }

        boolean match = (i < str.length() && (str.charAt(i) == ptrn.charAt(j) || ptrn.charAt(j) == '.'));

        boolean result;
        if(j+1 < ptrn.length() && ptrn.charAt(j+1) == '*'){
            result = dp(i, j+2, str, ptrn) || (match && dp(i+1, j, str, ptrn));
        } else {
            result = match && dp(i+1, j+1, str, ptrn);
        }
        memo[i][j] = result;
        return result;
    }
}