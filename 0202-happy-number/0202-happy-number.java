class Solution {
    public boolean isHappy(int n) {
        int slow = getNum(n);
        int fast = getNum(getNum(n));

        while(slow != fast){
            if(fast == 1) return true;
            slow = getNum(slow);
            fast = getNum(getNum(fast));
        }

        return slow == 1;
    }

    private int getNum(int n){
        int rem = 0;
        while(n > 0){
            int digit = n%10;
            rem += digit*digit;
            n /= 10; 
        }
        return rem;
    }
}