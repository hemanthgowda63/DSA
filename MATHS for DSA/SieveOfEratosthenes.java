public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 30; // Find primes up to 30
        boolean[] prime = new boolean[n + 1]; // Array to store true/false

        // Initialize all entries as true
        for (int i = 0; i <= n; i++) prime[i] = true;

        // Loop starting from 2 (first prime)
        for (int p = 2; p * p <= n; p++) {
            // If prime[p] is not changed, then it is a prime   
            if (prime[p] == true) {
                // Update all multiples of p to false (not prime)
                // Start from p*p, increment by p
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }

        // Print all true indices
        System.out.print("Primes up to " + n + ": ");
        for (int i = 2; i <= n; i++) {
            if (prime[i] == true) {
                System.out.print(i + " ");
            }
        }
    }
}
