/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @BingChat
 * @author MOPHE
 */
public class BinarySearchArrayList {

    public static void main(String[] args) {
        String path = "C:\\Users\\MOPHE\\Documents\\NetBeansProjects\\Exercises\\src\\exercises\\files\\english.txt";
        ArrayList<String> list = new ArrayList<>();
        try {
            File file = new File(path);
            try (Scanner scanner = new Scanner(file)) {
                scanner.useDelimiter("\n");
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    list.add(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        Collections.sort(list);
        System.out.println(list);

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int index = Collections.binarySearch(list, input);
        System.out.println(input + " is found at index " + index);
    }
}
