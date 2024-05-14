package Week1.Labs;

public class Labs {

    public Labs() {
    }

    /**
     * Uniform random numbers. Write a program that prints five uniform random numbers between min and max, their
     * average value, and their minimum and maximum values. Use Math.random(), Math.min(), and Math.max().
     *
     * @param min The minimum interval
     * @param max The maximum interval
     */
    public static void uniformRandomNumbers(double min, double max) {
        double random1 = Math.random() * (max - min) + min;
        double random2 = Math.random() * (max - min) + min;
        double random3 = Math.random() * (max - min) + min;
        double random4 = Math.random() * (max - min) + min;
        double random5 = Math.random() * (max - min) + min;

        double average = (random1 + random2 + random3 + random4 + random5) / 5;

        double minRandom = Math.min(random1, Math.min(random2, Math.min(random3, Math.min(random4, random5))));
        double maxRandom = Math.max(random1, Math.max(random2, Math.max(random3, Math.max(random4, random5))));

        System.out.printf("Random numbers: %.2f %.2f %.2f %.2f %.2f\n", random1, random2, random3, random4, random5);
        System.out.printf("Average: %.2f\n", average);
        System.out.printf("Min: %.2f\n", minRandom);
        System.out.printf("Max: %.2f\n", maxRandom);
    }

    /**
     * Three-sort. Write a program that takes three integer command-line arguments and prints them in ascending
     * order. Use Math.min() and Math.max().
     *
     * @param a The first integer
     * @param b The second integer
     * @param c The third integer
     */
    public static void threeSort(int a, int b, int c) {
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(c, Math.min(a, b));
        int mid = a + b + c - min - max;

        System.out.printf("[%d, %d, %d] sorted in ascending order: [%d, %d, %d]\n", a, b, c, min, mid, max);
    }

    /*
      Write the following code in the main method of the Main class to test the methods in this class:
      int a, b, c, d, e;

              Scanner scanner = new Scanner(System.in);

              System.out.println("Enter the value of A: ");
              a = scanner.nextInt();

              System.out.println("Enter the value of B: ");
              b = scanner.nextInt();

              System.out.println("Enter the value of C: ");
              c = scanner.nextInt();

              System.out.println("Enter the value of D: ");
              d = scanner.nextInt();

              System.out.println("Enter the value of E: ");
              e = scanner.nextInt();

              Labs.uniformRandomNumbers(a, b);
              Labs.threeSort(c, d, e);
     */
}