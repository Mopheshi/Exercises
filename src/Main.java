import Week1.Labs.Labs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c, d, e;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of A: ");
        a = scanner.nextInt();

        System.out.println("Enter the value of B: ");
        b = scanner.nextInt();

        System.out.println("Enter the value of C: ");
        c = scanner.nextInt();

        System.out.println("Enter the value of D: ");
        d = scanner.nextInt();

        System.out.println("Enter the value of E: ");
        e = scanner.nextInt();

        Labs.uniformRandomNumbers(a, b);
        Labs.threeSort(c, d, e);
    }
}