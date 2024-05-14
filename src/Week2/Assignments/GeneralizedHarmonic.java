package Week2.Assignments;

public class GeneralizedHarmonic {
    /**
     * Write a program GeneralizedHarmonic.java that takes two integer command-line arguments n and r and uses a for
     * loop to compute the nth generalized harmonic number of order r, which is defined by the following formula:
     * <p><code>
     * H(n,r) = 1 / r^1 + 1 / r^2 + 1 / r^3 + ... + 1 / r^n
     * </code></p>
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]), r = Integer.parseInt(args[1]); // Get the command-line arguments

        double sum = 0.0; // Initialize the sum to 0.0

        if (n >= 0) for (int i = 1; i <= n; i++) sum += 1 / Math.pow(i, r); // Compute the sum using the formula H(n,r)

        System.out.println(sum);
    }
}
