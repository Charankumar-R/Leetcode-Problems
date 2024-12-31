class Solution {
    public String baseNeg2(int N) {
        int num=1;//initialize num =1 
        while (num < N) num = (num<<2)+1;//Construct mask
        return Integer.toBinaryString(num^(num-N));//calculate base-2 Representation 
    }
}