package Week1.Assignments;

public class RightTriangle {
    /**
     * Write a program RightTriangle that takes three int command-line arguments and determines whether they constitute
     * the side lengths of some right triangle.
     * The following two conditions are necessary and sufficient:
     * 1. Each integer must be positive.
     * 2. The sum of the squares of two of the integers must equal the square of the third integer.
     * You need to write a program that takes three integers as command-line arguments and prints "true" if they
     * constitute the side lengths of some right triangle, and false otherwise.
     * <p><code>
     * Formula: a^2 + b^2 = c^2 or a^2 + c^2 = b^2 or b^2 + c^2 = a^2
     * </code></p>
     */
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean isRightTriangle = a > 0 && b > 0 && c > 0 && (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a);

        System.out.println(isRightTriangle);
    }
}
