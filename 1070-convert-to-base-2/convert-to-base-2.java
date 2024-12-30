class Solution {
    public String baseNeg2(int N) {
        int num=1;
        while (num < N) num = (num<<2)+1;
        return Integer.toBinaryString(num^(num-N));
    }
}