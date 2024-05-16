package Week3.Assignments;

public class DiscreteDistribution {
    /**
     * Write a program DiscreteDistribution.java that takes an integer command-line argument m, followed by a sequence
     * of positive integer command-line arguments a1,a2,…,an, and prints m random indices (separated by whitespace),
     * choosing each index i with probability proportional to ai.
     * java DiscreteDistribution 25 1 1 1 1 1 1
     * 5 2 4 4 5 5 4 3 4 3 1 5 2 4 2 6 1 3 6 2 3 2 4 1 4
     * DiscreteDistribution 25 10 10 10 10 10 50
     * 3 6 6 1 6 6 2 4 6 6 3 6 6 6 6 4 5 6 2 2 6 6 2 6 2
     * java DiscreteDistribution 25 80 20
     * 1 2 1 2 1 1 2 1 1 1 1 1 1 1 1 2 2 2 1 1 1 1 1 1 1
     * java DiscreteDistribution 100 301 176 125 97 79 67 58 51 46
     * 6 2 4 3 2 3 3 1 7 1 1 3 4 7 1 4 2 2 1 1 3 1 8 6 2
     * 1 3 6 1 8 5 1 3 6 1 1 2 3 8 7 4 6 4 3 1 5 3 3 7 3
     * 1 3 1 7 7 2 2 3 6 5 4 1 1 1 7 2 3 5 2 2 1 4 1 2 1
     * 2 1 2 2 3 2 8 4 3 2 1 8 3 5 3 3 8 1 2 3 3 1 2 3 1
     * To generate a random index i with probability proportional to ai:
     * 1. Define the cumulative sums Si=a1+a2+…+ai, with S0=0.
     * 2. Pick a random integer r uniformly between 0 and Sn−1.
     * 3. Find the unique index i between 1 and n such that Si−1≤r<Si.
     * Geometrically, this subdivides the interval [0,Sn) into n subintervals [Si−1,Si), with the length of subinterval
     * i proportional to ai. For example, if the discrete distribution is defined by
     * (a1,a2,a3,a4,a5,a6) = (10,10,10,10,10,50), then the cumulative sums are (S1,S2,S3,S4,S5,S6) = (10,20,30,40,50,100)
     * and the following diagram illustrates the 6 subintervals: sampling from a discrete distribution
     * In probability theory, this is known as sampling from a discrete distribution.
     * The algorithm is known as the alias method and is a simple and efficient way to generate random samples from a
     * discrete distribution.
     */
    public static void main(String[] args) {
        // m random indices, n positive integers, sum of all positive integers, and cumulative sum of positive integers
        int m = Integer.parseInt(args[0]), n = args.length - 1, sum = 0;
        int[] a = new int[n], s = new int[n]; // a = positive integers, s = cumulative sum of positive integers
        for (int i = 0; i < n; i++) { // parse positive integers and calculate cumulative sum
            a[i] = Integer.parseInt(args[i + 1]); // parse positive integer from command-line arguments
            sum += a[i]; // calculate sum of all positive integers
            s[i] = sum; // calculate cumulative sum of positive integers
        }
        for (int i = 0; i < m; i++) { // generate m random indices with probability proportional to ai
            int r = (int) (Math.random() * sum); // generate random integer r uniformly between 0 and sum - 1
            // find unique index i between 1 and n such that [Si − 1 ≤ r < Si]
            for (int j = 0; j < n; j++)
                if (r < s[j]) { // if r is less than cumulative sum of positive integers
                    System.out.print(j + 1 + " "); // print index j
                    break; // break out of the loop
                }
        }
    }
}
