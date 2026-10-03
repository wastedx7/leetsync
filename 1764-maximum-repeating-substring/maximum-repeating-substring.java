class Solution {
    public int maxRepeating(String sequence, String word) {
        int count = 0;
        StringBuilder str = new StringBuilder(word);
        
        while(sequence.contains(str.toString())){
            count++;
            str.append(word);
        }
        return count;
    }
}