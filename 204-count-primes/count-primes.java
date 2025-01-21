class Solution {
    public int countPrimes(int n) {

        int count = 0;
        int[] prime = new int[n]; // No need for n+1 since we're counting primes strictly less than n

        // Initialize the prime array
        for (int i = 2; i < n; i++) {
            prime[i] = 1; // Assume all numbers are prime initially
        }

        // Sieve of Eratosthenes
        for (int i = 2; i * i < n; i++) {
            if (prime[i] == 1) { // If i is prime
                for (int j = i * i; j < n; j += i) { // Mark multiples of i as non-prime
                    prime[j] = 0;
                }
            }
        }

        // Count the primes
        for (int i = 2; i < n; i++) {
            if (prime[i] == 1) {
                count++;
            }
        }

        return count;
    }
}