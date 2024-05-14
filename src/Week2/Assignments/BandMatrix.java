package Week2.Assignments;

public class BandMatrix {
    /**
     * Write a program BandMatrix.java that takes two integer command-line arguments n and width and prints an n-by-n
     * pattern like the ones below, with a zero (0) for each element whose distance from the main diagonal is strictly
     * more than width, and an asterisk (*) for each entry that is not, and two spaces between each 0 or *.
     * <p>
     * % java BandMatrix 8 0
     * *  0  0  0  0  0  0  0
     * 0  *  0  0  0  0  0  0
     * 0  0  *  0  0  0  0  0
     * 0  0  0  *  0  0  0  0
     * 0  0  0  0  *  0  0  0
     * 0  0  0  0  0  *  0  0
     * 0  0  0  0  0  0  *  0
     * 0  0  0  0  0  0  0  *
     * <p>
     * % java BandMatrix 8 3
     * *  *  *  *  0  0  0  0
     * *  *  *  *  *  0  0  0
     * *  *  *  *  *  *  0  0
     * *  *  *  *  *  *  *  0
     * 0  *  *  *  *  *  *  *
     * 0  0  *  *  *  *  *  *
     * 0  0  0  *  *  *  *  *
     * 0  0  0  0  *  *  *  *
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]), width = Integer.parseInt(args[1]); // Parse the command-line arguments

        if (n >= 0 && width >= 0) for (int i = 0; i < n; i++) { // Check if n and width are positive
            for (int j = 0; j < n; j++) // Loop through the rows [i] and columns [j] of the matrix to print the pattern
                // Print * if the absolute difference between i and j is less than or equal to width
                if (Math.abs(i - j) <= width) System.out.print("* ");
                    // Else print 0 if the absolute difference between i and j is greater than width
                else System.out.print("0 ");
            System.out.println(); // Print a newline after each row
        }
    }
}
