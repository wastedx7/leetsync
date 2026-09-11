import java.util.Set;
import java.util.HashSet;

class Solution {
    Set<Integer> set = new HashSet<>();

    private void backtrack(int[] digits, boolean[] used, int curr, int size){
        if(size == 3){
            set.add(curr);
            return;
        }
        for(int i=0; i<digits.length; i++){
            if(used[i]) continue;

            int d = digits[i];

            if(size == 0 && d == 0) continue;

            if(size == 2 && d % 2 != 0) continue;

            used[i] = true;
            backtrack(digits, used, curr * 10 + d, size+1);
            used[i] = false;
        }
    }

    public int totalNumbers(int[] digits) {
        boolean[] used = new boolean[digits.length];
        backtrack(digits, used, 0, 0);
        return set.size();
    }
}