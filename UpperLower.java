package exercises;

import java.util.Scanner;

/**
 *
 * @author MOPHE
 */
public class UpperLower {

    public static void main(String[] args) {
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type anything: ");
        string = scanner.next();

        System.out.print(string + " in lowercase: ");

        for (int i = 0; i < string.length(); i++) {
            char letter = string.charAt(i);

            if (letter >= 'A' && letter <= 'Z') {
                letter = (char) (letter + 32);
            }

            System.out.print(letter);
        }

        System.out.println();
        System.out.print(string + " in UPPERCASE: ");

        for (int i = 0; i < string.length(); i++) {
            char letter = string.charAt(i);

            if (letter >= 'a' && letter <= 'z') {
                letter = (char) (letter - 32);
            }

            System.out.print(letter);
        }

        System.out.println();
    }
}
