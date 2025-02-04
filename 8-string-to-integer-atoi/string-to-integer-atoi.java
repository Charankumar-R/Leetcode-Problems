class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.isEmpty()) return 0;

        int sign=1;
        int ind=0;

        if(s.charAt(0)=='+' || s.charAt(0)=='-'){
            if(s.charAt(0)=='-') {
                sign=-1;
            }
            ind++;
        }
        return sign*atoi(s,ind,0,sign);
    }

    private int atoi(String s,int ind,int res,int sign){
        if(ind>=s.length() || !Character.isDigit(s.charAt(ind))){
            return res;
        }
        int dig=s.charAt(ind)-'0';

        if (res > (Integer.MAX_VALUE - dig) / 10) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return atoi(s,ind+1,res*10+dig,sign);
    }
}