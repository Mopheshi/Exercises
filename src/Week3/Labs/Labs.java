package Week3.Labs;

public class Labs {
    /**
     * Write a code fragment to multiply two rectangular matrices that are not necessarily square. Note: For the
     * dot product to be well-defined, the number of columns in the first matrix must be equal to the number of rows in
     * the second matrix. Print an error message if the dimensions do not satisfy this condition.
     */
    public int[][] multiplyMatrices(int[][] a, int[][] b) {
        if (a[0].length != b.length) {
            System.out.println("Error: Number of columns in the first matrix must be equal to the number of rows in the second matrix.");
            return null;
        }

        int[][] result = new int[a.length][b[0].length];
        // Rows of the first matrix
        for (int i = 0; i < a.length; i++)
            // Columns of the second matrix
            for (int j = 0; j < b[0].length; j++)
                // Columns of the first matrix
                for (int k = 0; k < a[0].length; k++) result[i][j] += a[i][k] * b[k][j];

        return result;
    }

    /**
     * Find a duplicate. Given an integer array of length n, with each value between 1 and n, write a code
     * fragment to determine whether there are any duplicate values. You may not use an extra array (but you do not need
     * to preserve the contents of the given array.)
     */
    public boolean hasDuplicates(int[] array) {
        // Pro approach
        for (int i = 0; i < array.length; i++) {
            int absVal = Math.abs(array[i]); // Get the absolute value of the current element
            if (array[absVal - 1] < 0) return true; // If the value at the index is negative, then it's a duplicate
            else array[absVal - 1] = -array[absVal - 1]; // Otherwise, make the value at the index negative
        }

        // Novice approach
        // for (int i = 0; i < array.length; i++)
        // for (int j = 0; j < array.length; j++) if (i != j && array[i] == array[j]) return true;

        return false;
    }

    /**
     * Binomial coefficients. Write a program that takes an integer command-line argument n and creates a
     * two-dimensional ragged array a[][] such that a[n][k] contains the probability that you get exactly k heads when
     * you toss a fair coin n times. These numbers are known as the binomial distribution: if you multiply each element
     * in row i by 2^n, you get the binomial coefficients—the coefficients of x^k in (x+1)^n—arranged in Pascal’s
     * triangle. To compute them, start with a[n][0] = 0.0 for all n and a[1][1] = 1.0, then compute values in
     * successive rows, left to right, with a[n][k] = (a[n-1][k] + a[n-1][k-1]) / 2.0.
     */
    public void binomialDistribution(int n) {
        double[][] array = new double[n + 1][n + 1]; // n + 1 rows and n + 1 columns

        for (int i = 0; i < array.length; i++) // Iterate through the rows
            for (int j = 0; j < array[0].length; j++) // Iterate through the columns
                if (i == 0) array[i][j] = 0.0; // Initialize the first row to 0.0
                else if (j == 0) array[i][j] = 0.0; // Initialize the first column to 0.0
                else if (j == 1) array[i][j] = 1.0; // Initialize the second column to 1.0
                    // Compute values in successive rows, left to right a[n][k] = (a[n-1][k] + a[n-1][k-1]) / 2.0
                else array[i][j] = (array[i - 1][j] + array[i - 1][j - 1]) / 2.0;

        print2DArray(array);
    }

    public static void print2DArray(double[][] array) {
        for (double[] ints : array) {
            for (int j = 0; j < array[0].length; j++) System.out.print(ints[j] + " ");
            System.out.println();
        }
    }

    /*
        Write the following code in the main method of the Main class to test the methods in this class:
        int n = Integer.parseInt(args[0]);
        Labs labs = new Labs();
        double[][] a = new double[][]{{1, 2, 3}, {4, 5, 6}};
        double[][] b = new double[][]{{7, 8}, {9, 10}, {11, 12}};
        double[][] result = labs.multiplyMatrices(a, b);
        if (result != null) {
            System.out.println("Result of multiplying two matrices:");
            labs.print2DArray(result);
        }
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Has duplicates: " + labs.hasDuplicates(arr));
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 7};
        System.out.println("Has duplicates: " + labs.hasDuplicates(arr2));
        labs.binomialDistribution(n);
    */
}