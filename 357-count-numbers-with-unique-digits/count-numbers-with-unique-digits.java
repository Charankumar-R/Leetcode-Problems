class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        if (n==1){
            return 10;
        }
        int total = 10;
        int a=9,b=9;
        for (int i = 1; i < n ; i++) {
            a=a*b;
            total=total+a;
            b--;
        }
        return total;
    }
}