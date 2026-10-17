import java.math.BigInteger;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int n : num){
            sb.append(n);
        }
        BigInteger minnie = new BigInteger(sb.toString());
        minnie = minnie.add(BigInteger.valueOf(k));
        String str = minnie.toString();
        for(char c : str.toCharArray()){
            ans.add(c - '0');
        }
        return ans;
    }
}