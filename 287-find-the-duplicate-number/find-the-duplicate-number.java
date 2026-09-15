class Solution {
    Set<Integer> set = new HashSet<>();
    public int findDuplicate(int[] nums) {
        for(int n : nums){
            if(!set.contains(n)){
                set.add(n);
            } else {
                return n;
            }
        }
        return -1;
    }
}