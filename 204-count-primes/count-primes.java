class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0; // No primes less than 2
        
        int count = 0;
        int[] prime = new int[n];
        Arrays.fill(prime, 1); // Assume all numbers are prime
        prime[0] = 0;
        prime[1] = 0; // 0 and 1 are not primes

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

