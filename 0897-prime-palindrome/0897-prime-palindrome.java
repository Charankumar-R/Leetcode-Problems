class Solution {
    public int primePalindrome(int n) {
        while (true){
            if (isPalindrome(n) && isPrime(n)) return n;
            n++;
            if (n > 11 && n % 11 == 0 && (Integer.toString(n).length() % 2 == 0)){
                n = (int)Math.pow(10,Integer.toString(n).length());
            }
        }
    }

    private boolean isPrime(int n){
        if (n < 2) return false;
        for (int i = 2, sq = (int)Math.sqrt(n); i <= sq; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    private boolean isPalindrome(int n){
        String s = Integer.toString(n);
        for (int i = 0, j = s.length() - 1; i < j; i++, j--){
            if(s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
    }
}