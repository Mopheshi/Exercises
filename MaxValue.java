/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises;

import java.util.Arrays;

/**
 *
 * @author MOPHE
 */
public class MaxValue {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 30, 4, 5, 60, 7, 8, 9, 10};
        int[][] arrays = new int[][]{{1, 2, 30}, {4, 5, 60}, {70, 8, 9}};
        int[][][] arr = new int[][][]{{{1, 2, 30}, {4, 5, 60}, {70, 8, 9}}, {{11, 221, 3032}, {43, 545, 606}, {70, 84, 93}}, {{13, 22, 340}, {46, 565, 6340}, {740, 82, 956}}};
        int max = MaxValue(array);
        int maxi = MaxValue(arrays);
        int maximum = MaxValue(arr);

        System.out.println("Maximum value in " + Arrays.toString(array) + " is " + max + "\n");

        System.out.println("Maximum value in: ");
        print2D(arrays);
        System.out.println("...is " + maxi + "\n");

        // System.out.println("Maximum value in " + Arrays.deepToString(arr) + " is " + maximum + "\n");
        System.out.println("Maximum value in: ");
        print3D(arr);
        System.out.println("...is " + maximum + "\n");
    }

    /*
     * Returns the maximum value in a 1D array
     */
    private static int MaxValue(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    /**
     * Returns the maximum value in a 2D array
     */
    private static int MaxValue(int[][] array) {
        int max = array[0][0];

        // for (int rows = 0; rows < array.length; rows++) can be used instead of the for-loop on the line below
        for (int[] rows : array) {
            for (int columns = 0; columns < array.length; columns++) {
                if (rows[columns] > max) {
                    max = rows[columns];
                }
            }
        }

        return max;
    }

    /**
     * Returns the maximum value in a 3D array
     */
    private static int MaxValue(int[][][] array) {
        int max = array[0][0][0];

        // for (int rows = 0; rows < array.length; rows++) can be used instead of the for-loop on the line below
        for (int[][] rows : array) {
            for (int[] columns : rows) {
                for (int balablu = 0; balablu < columns.length; balablu++) {
                    if (columns[balablu] > max) {
                        max = columns[balablu];
                    }
                }
            }
        }

        return max;
    }

    /**
     * Prints 2D array in matrix format
     */
    private static void print2D(int[][] array) {
        for (int[] rows : array) {
            System.out.println(Arrays.toString(rows));
        }
    }

    /**
     * Prints 3D array in matrix format
     */
    private static void print3D(int[][][] array) {
        for (int[][] rows : array) {
            for (int[] columns : rows) {
                System.out.println(Arrays.toString(columns));
            }
        }
    }
}
