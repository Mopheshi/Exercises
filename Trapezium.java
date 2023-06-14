package exercises;

import java.util.Scanner;

/**
 *
 * @author MOPHE
 */
public class Trapezium {

    public static void main(String[] args) {
        double length, breadth, height, area;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the length of the trapezoid: ");
        length = scanner.nextDouble();
        while (length <= 0) {
            System.out.println("Please input a valid length greater than 0: ");
            length = scanner.nextDouble();
        }

        System.out.println("Input the breadth of the trapezoid: ");
        breadth = scanner.nextDouble();
        while (breadth <= 0) {
            System.out.println("Please input a valid breadth greater than 0: ");
            breadth = scanner.nextDouble();
        }

        System.out.println("Input the height of the trapezoid: ");
        height = scanner.nextDouble();
        while (height <= 0) {
            System.out.println("Please input a valid height greater than 0: ");
            height = scanner.nextDouble();
        }

        area = TrapezoidArea(length, breadth, height);
        System.out.println("The area of the trapezium is = " + area);
    }

    private static double TrapezoidArea(double length, double breadth, double height) {
        return ((length + breadth) / 2) * height;
    }
}
