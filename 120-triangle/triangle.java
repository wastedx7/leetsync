class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int i=triangle.size()-2; i>=0; i--){
            for(int j=0; j<triangle.get(i).size(); j++){
                int bottom = triangle.get(i+1).get(j);
                int bottomRight = triangle.get(i+1).get(j+1);

                int curr = triangle.get(i).get(j);

                triangle.get(i).set(j, curr + Math.min(bottom, bottomRight));
            }
        }
        return triangle.get(0).get(0);
    }
}