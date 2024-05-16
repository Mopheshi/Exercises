package Week4.Labs;

import Week4.StdDraw;

import java.util.Arrays;

public class Labs {
    /**
     * Write a program that reads in a sequence of integers and prints both the integer that appears in a longest
     * consecutive run and the length of that run. For example, if the input is 1 2 2 1 5 1 1 7 7 7 7 1 1, then your
     * program should print Longest run: 4 consecutive 7s.
     */
    public void consecutiveRuns(int[] integers) {
        int maxCount = 0, tempCount = 1, maxNum = 0, lastIndex = integers.length - 1;
        for (int i = 0; i < lastIndex; i++)
            if (integers[i] == integers[i + 1]) tempCount++;
            else {
                if (tempCount > maxCount) {
                    maxCount = tempCount;
                    maxNum = integers[i];
                }
                tempCount = 1;
            }
        // Check for the last run
        if (tempCount > maxCount) {
            maxCount = tempCount;
            maxNum = integers[lastIndex];
        }
        System.out.printf("Longest consecutive run: %d consecutive %ds\n\n", maxCount, maxNum);
    }

    /**
     * Write a filter that reads in a sequence of integers and prints the integers, removing repeated values that appear
     * consecutively. For example, if the input is 1 2 2 1 5 1 1 7 7 7 7 1 1 1 1 1 1 1 1 1,
     * your program should print 1 2 1 5 1 7 1.
     */
    public void filter(int[] integers) {
        String numbers = "";
        int count = 1, num = 0, lastIndex = integers.length - 1;
        for (int i = 0; i < lastIndex; i++)
            if (integers[i] == integers[i + 1]) {
                count++;
            } else {
                numbers += integers[i] + " ";
                count = 1;
            }
        numbers += integers[lastIndex];
        System.out.println(numbers + "\n");
    }

    /**
     * Write a program that takes an integer command-line argument n, reads in n-1 distinct integers between 1 and n,
     * and determines the missing value.
     */
    public void missingValue(int n, int[] integers) {
        int sum = 0;
        for (int i : integers) sum += i;
        int missing = (n * (n + 1) / 2) - sum;
        System.out.println("Missing value in " + Arrays.toString(integers) + " is: " + missing + "\n");
    }

    /**
     * Write a program that reads in a sequence of real numbers between -1 and +1 and prints their average magnitude,
     * average power, and the number of zero crossings. The average magnitude is the average of the absolute values of
     * the data values. The average power is the average of the squares of the data values. The number of zero crossings
     * is the number of times a data value transitions from a strictly negative number to a strictly positive number, or
     * vice versa. These three statistics are widely used to analyze digital signals.
     */
    public void digitalSignals(double[] sequence) {
        double sumMagnitude = 0.0, sumPower = 0.0;
        int zeroCrossings = 0, size = sequence.length;
        for (int i = 0; i < size - 1; i++) {
            sumMagnitude += Math.abs(sequence[i]);
            sumPower += (sequence[i] * sequence[i]);
            if ((sequence[i] < 0 && sequence[i + 1] > 0) || (sequence[i] > 0 && sequence[i + 1] < 0)) zeroCrossings++;
        }
        double averageMagnitude = sumMagnitude / size, averagePower = sumPower / size;
        System.out.printf("Average magnitude: %f\nAverage power: %f\nZero crossings: %d\n",
                averageMagnitude, averagePower, zeroCrossings);
    }

    /**
     * Histogram. Suppose that the standard input stream is a sequence of double values. Write a program that takes an
     * integer n and two real numbers lo and hi as command-line arguments and uses Week4.StdDraw to plot a histogram of the
     * count of the numbers in the standard input stream that fall in each of the n intervals defined by dividing
     * (lo , hi) into n equal-sized intervals.
     */
    public void histogram(int n, double lo, double hi, double[] numbers) {
        int[] counts = new int[n]; // Initialize counts to 0
        double intervalWidth = (hi - lo) / n; // Width of each interval

        for (double number : numbers) { // Count the number of values in each interval
            int index = (int) ((number - lo) / intervalWidth); // Determine the interval of the number
            if (index >= 0 && index < n) { // If the number is in the range
                counts[index]++; // Increment the count of the interval
            }
        }

        for (int i = 0; i < n; i++) { // Iterate through the intervals
            double x = lo + i * intervalWidth; // x-coordinate of the center of the interval
            double y = counts[i] / 2.0; // y-coordinate of the center of the interval
            double rw = intervalWidth / 2.0; // Half the width of the interval
            double rh = counts[i] / 2.0; // Half the height of the interval
            StdDraw.filledRectangle(x, y, rw, rh); // Draw the rectangle
        }
    }

    /**
     * Spirographs. Write a program that takes three double command-line arguments R, r, and a and draws the
     * resulting spirograph. A spirograph (technically, an epicycloid) is a curve formed by rolling a circle of radius R,
     * If the pen offset from the center of the rolling circle is (r + a), then the equation of the resulting curve at
     * time t is given by:
     * x(t) = (R + r)cos(t) − (r + a)cos((R + r)t / r),
     * y(t) = (R + r)sin(t) − (r + a)sin((R + r)t / r).
     * Such curves were popularized by a best-selling toy that contains discs with gear teeth on the edges and small
     * holes that you could put a pen in to trace spirographs.
     */
    public void spirographs(double R, double r, double a) {
        StdDraw.setXscale(-R - r - a, R + r + a);
        StdDraw.setYscale(-R - r - a, R + r + a);

        for (double t = 0.0; t <= 100; t += 0.01) {
            double x = (R + r) * Math.cos(t) - (r + a) * Math.cos((R + r) * t / r);
            double y = (R + r) * Math.sin(t) - (r + a) * Math.sin((R + r) * t / r);
            StdDraw.point(x, y);
        }
    }

        /*
            Write the following code in the main method of the Main class to test the methods in this class:
            Labs labs = new Labs();

            int[] arr1 = {1, 2, 2, 1, 5, 1, 1, 7, 7, 7, 7, 1, 1},
                    arr2 = {1, 2, 2, 1, 5, 1, 1, 7, 7, 7, 7, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                    arr3 = {1, 2, 3, 4, 5, 6, 7, 9, 10};
            int n = arr3.length + 1;

            labs.consecutiveRuns(arr1);
            labs.filter(arr2);
            labs.missingValue(n, arr3);

            // Generate random sequence of real numbers between -1 and 1
            double[] arr4 = new double[n];
            for (int i = 0; i < n; i++) arr4[i] = (Math.random() * 2 - 1);
            System.out.println(Arrays.toString(arr4));
            labs.digitalSignals(arr4);

            labs.histogram(5, 0.0, 1.0, arr4);

            labs.spirographs(0.5, 0.1, 0.05);
        */
}
