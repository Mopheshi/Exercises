package Week3.Assignments;

public class Minesweeper {
    /**
     * Minesweeper is a 1960s era video game played on an m-by-n grid of cells. The goal is to deduce which cells
     * contain hidden mines using clues about the number of mines in neighboring cells. Write a program Minesweeper.java
     * that takes three integer command-line arguments m, n, and k and prints an m-by-n grid of cells with k mines, using
     * asterisks for mines and integers for the neighboring mine counts (with two space characters between each cell).
     * To do so:
     * Generate an m-by-n grid of cells, with exactly k of the mn cells containing mines, uniformly at random.
     * For each cell not containing a mine, count the number of neighboring mines (above, below, left, right, or diagonal).
     * java Minesweeper 9 9 10
     * 0  1  *  1  0  0  0  1  *
     * 1  3  2  2  0  0  0  1  1
     * *  2  *  1  0  0  1  1  1
     * 1  2  2  2  1  0  1  *  1
     * 0  1  2  *  1  0  1  1  1
     * 1  2  *  3  3  1  1  0  0
     * 1  *  3  *  2  *  1  0  0
     * 1  1  2  1  2  1  1  0  0
     * 0  0  0  0  0  0  0  0  0
     */
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]), // parse positive integer m from command-line arguments
                n = Integer.parseInt(args[1]), // parse positive integer n from command-line arguments
                k = Integer.parseInt(args[2]), // parse positive integer k from command-line arguments
                count = 0; // count = number of neighboring mines
        boolean[][] mines = new boolean[m][n]; // mines = cells containing mines
        // generate an m-by-n grid of cells with exactly k of the mn cells containing mines, uniformly at random
        for (int i = 0; i < k; i++) {
            int x, y; // x and y coordinates of cells containing mines
            do {
                x = (int) (Math.random() * m); // generate random integer x uniformly between 0 and m - 1
                y = (int) (Math.random() * n); // generate random integer y uniformly between 0 and n - 1
            } while (mines[x][y]); // repeat until cell does not contain a mine
            mines[x][y] = true; // cell contains a mine
        }
        // for each cell not containing a mine, count the number of neighboring mines
        for (int i = 0; i < m; i++) { // iterate over rows
            for (int j = 0; j < n; j++) { // iterate over columns
                if (mines[i][j]) System.out.print("*  "); // print * if cell contains a mine
                else for (int x = i - 1; x <= i + 1; x++) { // else, iterate over neighboring rows
                    for (int y = j - 1; y <= j + 1; y++) { // iterate over neighboring columns
                        if (x >= 0 && x < m && y >= 0 && y < n && mines[x][y])
                            count++; // increment count if neighboring cell contains a mine
                    }
                }
                System.out.print(count + "  "); // print number of neighboring mines
            }
            System.out.println(); // print new line
        }
    }
}
