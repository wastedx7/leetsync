class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans = new String[m];
        Arrays.fill(ans, 0, m-1, "." + "#".repeat(n-1));
        ans[m-1] = ".".repeat(n);
        return ans;
    }
}