class Solution {
    public boolean isPalindrome(long x) {
        if(x<0){
            return false;
        }
        long n=x;
        long dig=0,rev=0;
        while(n!=0){
            dig=n%10;
            rev=rev*10+dig;
            n/=10;
        }
        String str1=Long.toString(rev);
        String str2=Long.toString(x);
        return str1.equals(str2);
    }
}