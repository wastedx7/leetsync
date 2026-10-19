class Solution {
    public int maxDepth(String s) {
        int level = 0;
        int max = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                level++;
            } else if (c == ')') {
                level--;
            }
            max = Math.max(max, level);
        }
        return max;
    }
}