class Solution {
    public int maximumGroups(int[] grades) {
        int n=grades.length;
        int count=0;
        int stue=1;

        while(n>=stue){
            n-=stue;
            count++;
            stue++;
        }
        return count;
    }
}