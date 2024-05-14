package Week2.Assignments;

public class RandomWalker {
    /**
     * A Java programmer begins walking aimlessly. At each time step, she takes one step in a random direction (either
     * north, east, south, or west), each with probability 25%. She stops once she is at Manhattan distance r from the
     * starting point. How many steps will the random walker take? This process is known as a two-dimensional random walk.
     * <p>
     * Write a program RandomWalker.java that takes an integer command-line argument r and simulates the motion of a
     * random walk until the random walker is at Manhattan distance r from the starting point. Print the coordinates at
     * each step of the walk (including the starting and ending points), treating the starting point as (0, 0).
     * Also, print the total number of steps taken.
     * <p>
     * This process is a discrete version of a natural phenomenon known as Brownian motion. It serves as a scientific
     * model for an astonishing range of physical processes from the dispersion of ink flowing in water, to the
     * formation of polymer chains in chemistry, to cascades of neurons firing in the brain.
     */
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]), x = 0, y = 0, steps = 0; // Manhattan distance, x-coordinate, y-coordinate, steps
        System.out.println("(" + x + ", " + y + ")"); // Print starting point

        while (Math.abs(x) + Math.abs(y) != r) { // While Manhattan distance is not equal to r
            int direction = (int) (Math.random() * 4); // Random direction (0, 1, 2, 3)
            if (direction == 0) x++; // East
            else if (direction == 1) x--; // West
            else if (direction == 2) y++; // North
            else y--; // South

            System.out.println("(" + x + ", " + y + ")"); // Print coordinates
            steps++; // Increment steps
        }
        System.out.println("Total steps = " + steps);
    }
}
