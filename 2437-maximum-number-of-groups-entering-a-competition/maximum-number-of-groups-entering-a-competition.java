class Solution {
    public int maximumGroups(int[] grades) {
        int n=grades.length;
        int count=(int)Math.floor((-1+Math.sqrt(1+8*(double)n))/2);
        return count;
    }
}