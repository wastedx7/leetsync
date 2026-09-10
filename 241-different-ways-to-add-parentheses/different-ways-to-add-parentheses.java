class Solution {

    private int compute(int x, int y, char op){
        if(op == '+') return x + y;
        if(op == '-') return x - y;
        if(op == '*') return x * y;
        return 0;
    }

    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> results = new ArrayList<>();
        boolean isNumber = true;

        for(int i=0; i<expression.length(); i++){
            char op = expression.charAt(i);
            if(!Character.isDigit(op)){
                isNumber = false;

                List<Integer> left = diffWaysToCompute(expression.substring(0, i));

                List<Integer> right = diffWaysToCompute(expression.substring(i+1));

                for(int x : left){
                    for(int y : right){
                        int val = compute(x, y, op);
                        results.add(val);
                    }
                }
            }
        }
        if(isNumber){
            results.add(Integer.parseInt(expression));
        }
        return results;
    }
}