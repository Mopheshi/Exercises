package Week2.Assignments;

public class RandomWalkers {
    /**
     * Write a program RandomWalkers.java that takes two integer command-line arguments r and trials. In each of trials
     * independent experiments, simulate a random walk until the random walker is at Manhattan distance r from the
     * starting point. Print the average number of steps.
     * <p>
     * As r increases, we expect the random walker to take more and more steps. But how many more steps? Use
     * RandomWalkers.java to formulate a hypothesis as to how the average number of steps grows as a function of r.
     * <p>
     * Estimating an unknown quantity by generating random samples and aggregating the results is an example of Monte
     * Carlo simulation—a powerful computational technique that is used widely in statistical physics, computational
     * finance, and computer graphics.
     */
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]), trials = Integer.parseInt(args[1]); // Read the command-line arguments

        int totalSteps = 0; // Total number of steps taken in all trials
        for (int i = 0; i < trials; i++) { // For each trial
            int x = 0, y = 0, steps = 0; // Initialize the starting point and the number of steps taken
            while (Math.abs(x) + Math.abs(y) != r) { // While the walker is not at Manhattan distance r from the starting point
                double random = Math.random(); // Generate a random number between 0 and 1
                if (random < 0.25) x++; // Move north
                else if (random < 0.5) x--; // Move south
                else if (random < 0.75) y++; // Move east
                else y--; // Move west
                steps++; // Increment the number of steps taken
            }
            totalSteps += steps; // Add the number of steps taken in this trial to the total number of steps
        }
        System.out.println("Average number of steps = " + (double) totalSteps / trials);
    }
}
