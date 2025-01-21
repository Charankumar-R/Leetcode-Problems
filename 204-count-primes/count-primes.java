class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0; // No primes less than 2

        boolean[] isNotPrime = new boolean[n];
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (!isNotPrime[i]) { // If i is a prime number
                count++;
                // Mark multiples of i starting from i * i
                for (long j = (long) i * i; j < n; j += i) {
                    isNotPrime[(int) j] = true;
                }
            }
        }

        return count;
    }
}

