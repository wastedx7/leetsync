class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        int level = 0;

        for(char c : s.toCharArray()){
            if(c == '('){
                if(level > 0){
                    str.append('(');
                }
                level++;
            } else {
                level--;
                if(level > 0){
                    str.append(')');
                }
            }
        }
        return str.toString();
    }
}