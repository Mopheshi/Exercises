package exercises;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
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
        //        System.out.printf("'%s' has %d letters\n", string, numberOfCharacters); // formmated print statement
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
        printArray(multiplyArray(array));
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

        while (i < 10) {    // perform the action below 10 times but starting from 0 to 9
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

        for (int i = 0; i < word.length(); i++) {   // iterate through all the characters in the given word
            count++;    // increment the value of count by 1 for any character present
        }

        return count;   // return the accumulated value of count
    }

    /**
     * checks for even and odd numbers in an array and formats the output
     */
    private static void evenOdd(int[] array) {
        int even = 0, odd = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {    // if value at 'i' is divisible by 2, it is even, otherwise odd 
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

            for (int j = i + 1; j < size; j++) {    // iterate over all the elements in the array starting from 'i + 1'
                if (array[i] == array[j]) { // if the value at index 'i' of the two iterated arrays are equal,
                    count++;    // then increment the value of 'count' by 1
                    break;  // exit the loop
                }
            }

            if (count == 0) {
                newArray[index] = array[i]; // if the value of 'count' is equal to 0, assign the value at 'i' to new array
                index++;
            }
        }

        // the code below can be written as 'System.arraycopy(newArray, 0, array, 0, index);'
        // used to copy an array from the specified source array, beginning at the specified position,
        // to the specified position of the destination array
//        System.arraycopy(newArray, 0, array, 0, index); // the same as the for loop below...
        for (int i = 0; i < index; i++) {
            array[i] = newArray[i];
        }

        return newArray;    // return the new cleaned array
    }

    private static Object[] removeMultiples(int[] array) {
        int size = array.length;
        ArrayList<Integer> arrayIntegers = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            if (!arrayIntegers.contains(array[i])) {
                arrayIntegers.add(array[i]);
            }
        }

        return arrayIntegers.toArray();
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
    }

    /**
     * Multiply each element in the array by itself.
     *
     * @param array The input array of integers.
     * @return The array with each element multiplied by itself.
     */
    private static int[] multiplyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i];
        }
        return array;
    }
}
