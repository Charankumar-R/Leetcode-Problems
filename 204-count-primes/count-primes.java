class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0; // No primes less than 2

        // Only consider odd numbers
        boolean[] isNotPrime = new boolean[n / 2];
        int count = 1; // Count 2 as prime

        // Handle the odd numbers
        for (int i = 3; i * i < n; i += 2) {
            if (!isNotPrime[i / 2]) { // If i is prime
                // Mark multiples of i starting from i * i, skipping even numbers
                for (int j = i * i; j < n; j += i * 2) {
                    isNotPrime[j / 2] = true;
                }
            }
        }

        // Count primes
        for (int i = 1; i < n / 2; i++) {
            if (!isNotPrime[i]) count++;
        }

        return count;
    }

}
