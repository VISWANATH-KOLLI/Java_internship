//[4]

//The bug is in the recursive call here:
//return fibonacci(n-1) + fibonacci(n-2);
//When you calculate Fibonacci numbers using this approach, it can lead to a significant number of duplicate calculations, resulting in poor performance for larger values of n. To fix this issue and improve the efficiency of the code, you can use memoization (caching) to store the results of previously calculated Fibonacci numbers and avoid redundant calculations.
//Here's the corrected code:
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    private static Map<Integer, Integer> cache = new HashMap<>();

    public static int fibonacci(int n) {
        if (n <= 1)
            return n;

        // Check if the result is already cached
        if (cache.containsKey(n))
            return cache.get(n);

        // Calculate and cache the result
        int result = fibonacci(n - 1) + fibonacci(n - 2);
        cache.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        int n = 6;
        int result = fibonacci(n);
        System.out.println("The Fibonacci number at position " + n + " is: " + result);
    }
}
