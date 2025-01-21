class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0; // No primes less than 2

        boolean[] isNotPrime = new boolean[n];
        int count = 0;

        // Handle the first prime (2) separately
        for (int i = 2; i * i < n; i++) {
            if (!isNotPrime[i]) { // If i is prime
                // Mark multiples of i starting from i * i
                for (int j = i * i; j < n; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        // Count primes
        for (int i = 2; i < n; i++) {
            if (!isNotPrime[i]) count++;
        }

        return count;
    }

}
