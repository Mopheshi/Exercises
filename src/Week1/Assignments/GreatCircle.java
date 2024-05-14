package Week1.Assignments;

public class GreatCircle {
    /**
     * The great-circle distance is the length of the shortest path between two points (x1,y1) and (x2,y2)
     * on the surface of a sphere, where the path is constrained to be along the surface.
     * Write a program GreatCircle.java that takes four double command-line arguments x1, y1, x2, and y2 — the latitude
     * and longitude (in degrees) of two points on the surface of the earth—and prints the great-circle distance
     * (in kilometers) between them. Use the following Haversine formula:
     * d = 2r sin^(-1)(sqrt(sin^2((x2 - x1)/2) + cos(x1)cos(x2)sin^2((y2 - y1)/2))) where r = 6,371.0 is the mean radius
     * of the Earth (in kilometers).
     * Hint: The command-line arguments are given in degrees but Java’s trigonometric functions use radians.
     * Use Math.toRadians() to convert from degrees to radians.
     * Although the Earth is not a perfect sphere, this formula is a good approximation to the true distance.
     */
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        double r = 6371.0;

        double x1Radians = Math.toRadians(x1);
        double y1Radians = Math.toRadians(y1);
        double x2Radians = Math.toRadians(x2);
        double y2Radians = Math.toRadians(y2);

        double distance = 2 * r * Math.asin(Math.sqrt(Math.pow(Math.sin((x2Radians - x1Radians) / 2), 2) +
                Math.cos(x1Radians) * Math.cos(x2Radians) * Math.pow(Math.sin((y2Radians - y1Radians) / 2), 2)));

        System.out.println(distance);
    }
}
