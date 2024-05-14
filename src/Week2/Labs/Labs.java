package Week2.Labs;

public class Labs {
    /**
     * Write a program kary that takes two integer command line arguments i and k and converts i to base k. Assume that
     * i is an integer in Java’s long data type and that k is an integer between 2 and 16. For bases greater than 10,
     * use the letters A through F to represent the 11th through 16th digits, respectively.
     */
    public static void i2BaseK(long i, int k) {
        if (k < 2 || k > 16) throw new IllegalArgumentException("k must be between 2 and 16");

        String result = "";
        while (i > 0) {
            long remainder = i % k;
            if (remainder < 10) result = remainder + result;
            else result = (char) ('A' + (remainder - 10)) + result;
            i /= k;
        }

        System.out.println(result);
    }

    /**
     * Run quick experiments to determine the impact of using the termination condition (factor <= n/factor) instead of
     * (factor < n) in Factors in Program 1.3.9. For each method, find the largest n such that when you type in an
     * n-digit number, the program is sure to finish within 10 seconds.
     */
    public static void factors(int n) {
        // for (int i = 2; i <= n/i; i++)  // O(sqrt(n)) - better for large n
        for (int i = 2; i <= n; i++)    // O(n) - bad for large n
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }

        if (n > 1) System.out.println(n);
    }

    /**
     * Write a program RelativelyPrime that takes an integer command-line argument n and prints an n-by-n table such
     * that there is an * in row i and column j if the gcd of i and j is 1 (i and j are relatively prime) and a space in
     * that position otherwise.
     */
    public static void relativelyPrime(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                if (gcd(i, j) == 1) System.out.print("* ");
                else System.out.print("  ");
            System.out.println();
        }
    }

    private static int gcd(int i, int j) {
        if (j == 0) {
            return i;
        } else {
            return gcd(j, i % j);
        }
    }

    /**
     * Ramanujan’s taxi. Srinivasa Ramanujan was an Indian mathematician who became famous for his intuition for
     * numbers. When the English mathematician G. H. Hardy came to visit him one day, Hardy remarked that the number of
     * his taxi was 1729, a rather dull number. To which Ramanujan replied, “No, Hardy! No, Hardy! It is a very
     * interesting number. It is the smallest number expressible as the sum of two cubes in two different ways.” Verify
     * this claim by writing a program that takes an integer command-line argument n and prints all integers less than
     * or equal to n that can be expressed as the sum of two cubes in two different ways. In other words, find distinct
     * positive integers a, b, c, and d such that a^3 + b^3 = c^3 + d^3. Use four nested for loops.
     */
    public static void ramanujanTaxi(int n) {
        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) break;

            for (int b = a; b <= n; b++) {
                int b3 = b * b * b;
                if (a3 + b3 > n) break;

                for (int c = a + 1; c <= n; c++) {
                    int c3 = c * c * c;
                    if (c3 > a3 + b3) break;

                    for (int d = c; d <= n; d++) {
                        int d3 = d * d * d;
                        if (c3 + d3 > a3 + b3) break;

                        if (c3 + d3 == a3 + b3)
                            System.out.println((a3 + b3) + " = " + a + "^3 + " + b + "^3 = " + c + "^3 + " + d + "^3");
                    }
                }
            }
        }
    }

    /**
     * Counting primes. Write a program PrimeCounter that takes an integer command-line argument n and finds the number
     * of primes less than or equal to n. Use it to print out the number of primes less than or equal to 10 million.
     * Note : If you are not careful, your program may not finish in a reasonable amount of time!
     */
    public static void primeCounter(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) if (isPrime(i)) count++;
        System.out.println(count);
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) if (n % i == 0) return false;
        return true;
    }

    public String reverseInteger(int n) {
        int m = 0;
        while (n != 0) {
            m = (10 * m) + (n % 10);
            n = n / 10;
        }
        return Integer.toString(m);
    }

    /**
     * 2D random walk. A two-dimensional random walk simulates the behavior of a particle moving in a grid of points.
     * At each step, the random walker moves north, south, east, or west with probability equal to 1/4, independent of
     * previous moves. Write a program RandomWalker that takes an integer command-line argument n and estimates how
     * long it will take a random walker to hit the boundary of a 2n-by-2n square centered at the starting point.
     */
    public static void randomWalker(int n) {
        int x = 0, y = 0, steps = 2;
        while (Math.abs(x) < n && Math.abs(y) < n) { // while not at boundary of 2n-by-2n square centered at origin (0, 0)
            double r = Math.random(); // random number between 0 and 1
            if (r < 0.25) x++; // move north (up) if r is less than 0.25 (25%) of the time (1/4)
            else if (r < 0.5) x--; // move south (down) if r is less than 0.5 (50%) of the time (1/4 + 1/4)
            else if (r < 0.75) y++; // move east (right) if r is less than 0.75 (75%) of the time (1/4 + 1/4 + 1/4)
            else y++; // move west (left) if r is less than 1 (100%) of the time (1/4 + 1/4 + 1/4 + 1/4)
            // increment steps taken to reach boundary of 2n-by-2n square centered at origin (0, 0) by 1 each time a
            // move is made (north, south, east, or west) by random walker (particle) in grid of points (2D plane) at
            // each step (iteration) of the loop (while loop) until boundary is reached (exit condition)
            steps++;
        }
        System.out.println(steps);
    }

    /*
        Write the following code in the main method of the Main class to test the methods in this class:
        long i = Long.parseLong(args[0]);
        int k = Integer.parseInt(args[1]);
        int n = Integer.parseInt(args[2]);

        Labs.i2BaseK(i, k);
        Labs.factors(1000000000);
        Labs.relativelyPrime(n);
        Labs.ramanujanTaxi(20000);
        Labs.primeCounter(10000000);
        Labs.randomWalker(n);
     */
}
