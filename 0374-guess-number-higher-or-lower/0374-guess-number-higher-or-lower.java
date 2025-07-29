public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 0, r = n, m = 0;
        while(l <= r){
            m = l + (r - l) / 2;
            if(guess(m) == 0) return m;
            if(guess(m) == -1) r = m - 1;
            if(guess(m) == 1) l = m + 1;
        }
        return -1;
    }
}