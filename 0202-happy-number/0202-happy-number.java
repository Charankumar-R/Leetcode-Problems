class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        int i = 1;
        do {
            System.out.println("Slow Pointer "+ i);
            slow = getNum(slow);
            System.out.println("Fast Pointer "+ i);
            fast = getNum(getNum(fast));

            i++;
        }while(slow != fast);

        return slow == 1;
    }

    private int getNum(int n){
        int rem = 0;
        while(n > 0){
            int digit = n%10;
            System.out.println(digit);
            rem += digit*digit;
            n /= 10; 
        }
        return rem;
    }
}