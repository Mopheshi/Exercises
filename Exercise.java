package morpheus.softwares;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author MOPHE
 */
public class Exercise {

    public static void main(String[] args) {
        // 'number' and 'string' variable initializations
//        int number;
//        String string;

        Scanner scanner = new Scanner(System.in); // scanner object creation from Scanner class

        //        System.out.println("Type a number: ");
        //        number = scanner.nextInt(); // request integer input from the user
        //
        //        multiplicationTable(number);    // calling 'multiplicationTable' method
        //        System.out.println();   // print an empty line for readability
        //        multiplyTable(number);    // calling 'multiplyTable' method
        //
        //        System.out.println();   // print an empty line for readability
        //
        //        Scanner sc = new Scanner(System.in);   // sc object creation from Scanner class
        //        System.out.println("Type a word or sentence: ");
        //        // request string input from the user and return the entire string/sentence
        //        string = sc.nextLine(); // 'next()' return a single word while 'nextLine()' returns an entire sentence
        //
        //        // calling 'stringCounter' method and assigning the return value to 'numberOfCharacters' variable
        //        int numberOfCharacters = stringCounter(string);
        //        System.out.printf("'%s' has %d letters\n", string, numberOfCharacters); // formatted print statement

        // get the size of the array from the user
        System.out.println("How many numbers do you want in your array?: ");
        // initialize the 'size' of array to the user input, and 'i' to 0
        int size = scanner.nextInt(), i = 0;
        int[] array = new int[size];    // create a new array with the inputted 'size' from user input

        System.out.println("Enter your array of integers: ");   // request values to be added to array from user
        while (i < size) {
            array[i] = scanner.nextInt();   // insert the inputted values to the position of 'i'
            i++;    // increment the value of 'i' until it reaches the complete 'size' of the array
        }

//        evenOdd(array); // call the 'evenOdd' method by inserting the array variable as parameter

        // call the 'removeDuplicates' method by inserting the array variable as parameter
//         int[] cleanedArray = removeDuplicates(array);
//        Object[] cleanedArray = removeMultiples(array);

//        System.out.println("Old array = " + Arrays.toString(array));
//        System.out.println("Cleaned array = " + Arrays.toString(cleanedArray));

        System.out.println(Arrays.toString(array));
        System.out.println("Ascending order = " + isAscending(array));

        System.out.println();

        System.out.println("Type a word to check if it is abecedarian: ");
        System.out.println("Abecedarian = " + isAbecedarian(scanner.next().toLowerCase()));
    }

    /**
     * Prints the formatted multiplication table using for loop
     */
    private static void multiplicationTable(int integer) {
        int answer;

        for (int i = 0; i < 10; i++) {  // loop through 0 to 9 and perform the operation below
            answer = i * integer;   // multiply the value of i by the integer value and assign the result to answer
            System.out.printf("%d * %d = %d\n", integer, i, answer);    // formmated print statement
        }
    }

    /**
     * Prints the formatted multiplication table using while loop
     */
    private static void multiplyTable(int integer) {
        int answer, i = 0;

        // perform the action below 10 times but starting from 0 to 9
        while (i < 10) {
            answer = i * integer;   // multiply the value of i by the integer value and assign the result to answer
            System.out.printf("%d * %d = %d\n", integer, i, answer);    // formmated print statement
            i++;    // increment the value of i and perform the operation again until it reaches 10
        }
    }

    /**
     * Returns the total number of characters in a given work
     */
    private static int stringCounter(String word) {
        int count = 0;  // initialize count to initial 0

        // iterate through all the characters in the given word
        for (int i = 0; i < word.length(); i++)
            count++;    // increment the value of count by 1 for any character present

        return count;   // return the accumulated value of count
    }

    /**
     * checks for even and odd numbers in an array and formats the output
     */
    private static void evenOdd(int[] array) {
        int even = 0, odd = 0;

        for (int i : array) {
            if (i % 2 == 0) {    // if value at 'i' is divisible by 2, it is even, otherwise odd
                even++;
            } else {
                odd++;
            }
        }

        System.out.printf("Even numbers = %d\nOdd numbers = %d\n\n", even, odd);
    }

    private static int[] removeDuplicates(int[] array) {
        int size = array.length, count, index = 0;
        int[] newArray = new int[size];

        for (int i = 0; i < size; i++) {    // iterate over elements in the provided array
            count = 0;

            // iterate over all the elements in the array starting from 'i + 1'
            for (int j = i + 1; j < size; j++)
                if (array[i] == array[j]) { // if the value at index 'i' of the two iterated arrays are equal,
                    count++;    // then increment the value of 'count' by 1
                    break;  // exit the loop
                }

            if (count == 0) {
                newArray[index] = array[i]; // if the value of 'count' is equal to 0, assign the value at 'i' to new array
                index++;
            }
        }

        // the code below can be written as 'System.arraycopy(newArray, 0, array, 0, index);'
        // used to copy an array from the specified source array, beginning at the specified position,
        // to the specified position of the destination array
        for (int i = 0; i < index; i++) {
            array[i] = newArray[i];
        }

        return newArray;    // return the new cleaned array
    }

    /**
     * Removes all multiple elements from from array
     */
    private static Object[] removeMultiples(int[] array) {
        ArrayList<Integer> arrayIntegers = new ArrayList<>();   // create an empty ArrayList

        for (int i : array) {   // use enhanced for loop to iterate over all elements in the ArrayList
            if (!arrayIntegers.contains(i)) {   // if the current element is not in the ArrayList
                arrayIntegers.add(i);   // add the current element to the ArrayList
            }
        }

        return arrayIntegers.toArray(); // return the new ArrayList object containing unique elements from the array
    }

    /**
     * Checks if an array of integers is sorted in ascending order or not, and returns it's boolean result
     */
    private static boolean isAscending(int[] array) {
        int size = array.length;

        // return true is the array has only one element,but the algorithm below handles that
//        if (size == 1) return true;

        // the enhanced for loop below has the same effect as the one above
        for (int i = 0; i < size - 1; i++) {
            int currentInteger = array[i];  // assign to current element in the array to 'currentInteger' variable

            // return false if the 'currentInteger' is > the next element in the array
            if (currentInteger > array[i + 1]) return false;
        }

        return true;
    }

    /**
     * Checks if a string is abecedarian or not and returns it's boolean result
     */
    private static boolean isAbecedarian(String s) {
        char c = 'a';
        int size = s.length();

//        if (size == 1)    // return true if 's' is just a one-letter word, but the algorithm below handles that
//            return true;

        // iterate over all characters in string 's', we subtract 1 from the length to avoid exceptions
        for (int i = 0; i < size; i++) {
            // if the current character is < or = the next character in 's'
            if (c <= s.charAt(i)) c = s.charAt(i);    // initialize c to the current character in the string 's'
            else return false;
        }

        return true;
    }
}
