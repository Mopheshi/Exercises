package org.example;

/**
 * @author <a href="mailto:morpheusoftwares@gmail.com">Morpheus Softwares</a>
 */
public class GoalLine {
    public static void main(String[] args) {
        // Define the ball's initial position
        double x = 0.0;  // X-coordinate
        double y = 0.0;  // Y-coordinate
        double z = 0.0;  // Z-coordinate

        // Define the ball's initial velocity
        double vx = 0.5;  // Velocity along the X-axis
        double vy = 0.2;  // Velocity along the Y-axis
        double vz = 0.8;  // Velocity along the Z-axis

        // Define the time step
        double dt = 0.1;  // Time step (0.0 will result in an infinite iteration)

        // Define the goal line coordinates
        double goalLineX = 10.0;  // X-coordinate of the goal line
        double goalLineY = 4.0;   // Y-coordinate of the goal line
        double goalLineZ = 15.0;  // Z-coordinate of the goal line

        // Perform the ball's movement by iteration
        while (x < goalLineX || y < goalLineY || z < goalLineZ) {
            x += vx * dt;
            y += vy * dt;
            z += vz * dt;

            System.out.println("Ball position: (" + x + ", " + y + ", " + z + ")");
        }

        // Check if the ball has crossed the goal line
        if (x >= goalLineX && y >= goalLineY && z >= goalLineZ) {
            System.out.println("Goal! The ball has crossed the goal line.");
        } else if (x == goalLineX && y == goalLineY && z == goalLineZ) {
            System.out.println("The ball is on the goal line.");
        } else {
            System.out.println("No goal. The ball has not crossed the goal line.");
        }
    }

/*
    In this implementation, the ball's position is updated based on its velocity and the elapsed time (time step) in each
    iteration. The ball's velocity ('vx', 'vy', and 'vz') determines the rate at which the ball moves in each direction.

    We can as well ask the user to input the value of the ball's velocity (shooting power) and ball's coordinates
    (initial position).

    The time step ('dt') represents the duration between each iteration, allowing us to simulate the ball's movement
    over time. By multiplying the velocity components by the time step, we can determine the displacement of the ball in
    each iteration.

    The rest of the code checks if the ball has crossed the goal line by comparing its coordinates with the goal line's
    coordinates.
*/
}