class Solution {
    public long coloredCells(int n) {
        if(n==1) return 1;
        return 1+4L*n*(n-1)/2;
    }
}