package Week3.Assignments;

public class ThueMorse {
    /**
     * Write a program ThueMorse.java that takes an integer command-line argument n and prints an n-by-n pattern like
     * the ones below. Include two space characters between each + and - character.
     * java ThueMorse 4
     * +  -  -  +
     * -  +  +  -
     * -  +  +  -
     * +  -  -  +
     * java ThueMorse 8
     * +  -  -  +  -  +  +  -
     * -  +  +  -  +  -  -  +
     * -  +  +  -  +  -  -  +
     * +  -  -  +  -  +  +  -
     * -  +  +  -  +  -  -  +
     * +  -  -  +  -  +  +  -
     * +  -  -  +  -  +  +  -
     * -  +  +  -  +  -  -  +
     * java ThueMorse 16
     * +  -  -  +  -  +  +  -  -  +  +  -  +  -  -  +
     * -  +  +  -  +  -  -  +  +  -  -  +  -  +  +  -
     * -  +  +  -  +  -  -  +  +  -  -  +  -  +  +  -
     * +  -  -  +  -  +  +  -  -  +  +  -  +  -  -  +
     * -  +  +  -  +  -  -  +  +  -  -  +  -  +  +  -
     * +  -  -  +  -  +  +  -  -  +  +  -  +  -  -  +
     * +  -  -  +  -  +  +  -  -  +  +  -  +  -  -  +
     * -  +  +  -  +  -  -  +  +  -  -  +  -  +  +  -
     * -  +  +  -  +  -  -  +  +  -  -  +  -  +  +  -
     * +  -  -  +  -  +  +  -  -  +  +  -  +  -  -  +
     * +  -  -  +  -  +  +  -  -  +  +  -  +  -  -  +
     * -  +  +  -  +  -  -  +  +  -  -  +  -  +  +  -
     * +  -  -  +  -  +  +  -  -  +  +  -  +  -  -  +
     * -  +  +  -  +  -  -  +  +  -  -  +  -  +  +  -
     * -  +  +  -  +  -  -  +  +  -  -  +  -  +  +  -
     * +  -  -  +  -  +  +  -  -  +  +  -  +  -  -  +
     * The Thue–Morse sequence is an infinite sequence of 0s and 1s that is constructed by starting with 0 and
     * successively appending the bitwise negation (interchange 0s and 1s) of the existing sequence. Here are the first
     * few steps of this construction:
     * 0010110011010010110100110010110
     * To visualize the Thue–Morse sequence, create an n-by-n pattern by printing a + (plus sign) in row i and column j
     * if bits i and j in the sequence are equal, and a - (minus sign) if they are different.
     * Note: you may assume that n is a positive integer (but it need not be a power of 2).
     * The Thue–Morse sequence has many fascinating properties and arises in graphic design and in music composition.
     * It is named after Axel Thue and Marston Morse.
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); // parse positive integer n from command-line arguments
        boolean[] thueMorse = new boolean[n]; // Thue–Morse sequence of 0s and 1s
        // construct Thue–Morse sequence
        for (int i = 0; i < n; i++)
            thueMorse[i] = Integer.bitCount(i) % 2 == 0; // construct Thue–Morse sequence of 0s and 1s
        for (int i = 0; i < n; i++) { // print n-by-n pattern of + and - characters
            // print + if bits i and j in the sequence are equal, - if they are different
            for (int j = 0; j < n; j++)
                if (thueMorse[i] == thueMorse[j]) System.out.print("+  ");
                else System.out.print("-  ");  // print + or - character
            // You can use a ternary operator like the one below to yield the same output:
            // System.out.print(thueMorse[i] == thueMorse[j] ? "+  " : "-  "); // print + or - character
            System.out.println(); // print new line
        }
    }
}