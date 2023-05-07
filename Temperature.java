package exercises;

import java.util.Scanner;

/**
 *
 * @author MOPHE
 */
public class Temperature {

    public static void main(String[] args) {
        double celsius;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in the value of Celsius...");
        celsius = scanner.nextDouble();

        System.out.printf("The value of %.1f°C in Fahrenheit is = ", celsius);

        tempConversion(celsius);
        
        System.out.println("°F.");
    }

    private static void tempConversion(double celsius) {
        double F;

        F = celsius * 9 / 5 + 32;

        System.out.printf("%.1f", F);
    }
}
