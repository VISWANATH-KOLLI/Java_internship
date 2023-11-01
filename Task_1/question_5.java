//[5]

/*The code you provided has a bug in the condition for checking prime numbers.
The issue is in this part of the code:
for (int j = 2; j < i; j++) {
    if (i % j == 0) {
        isPrime = false;
        break;
    }
}
The condition if (i % j == 0) checks if i is divisible by j. If it is, the code sets isPrime to false. However, this condition will always be true when j is equal to i-1, which is unnecessary and causes incorrect results. To fix this, you should change the loop condition to j <= Math.sqrt(i) because you only need to check divisors up to the square root of i. 
Here's the corrected code:*/
import java.util.*;

public class PrimeNumbers {
    public static List<Integer> findPrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        int n = 20;
        List<Integer> primeNumbers = findPrimes(n);
        System.out.println("Prime numbers up to " + n + ": " + primeNumbers);
    }
}




