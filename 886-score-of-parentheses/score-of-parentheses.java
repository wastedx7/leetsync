class Solution {
    public int scoreOfParentheses(String s) {
        int score = 0;
        int depth = 0;

        for(int c=0; c<s.length(); c++){
            if(s.charAt(c) == '('){
                depth++;
            } else {
                depth--;
                if(s.charAt(c-1) == '('){
                    score += 1 << depth;
                }
            }
        }

        return score;
    }
}