package exercises;

import java.util.Scanner;

/**
 * Driver class
 *
 * @author MOPHE
 */
public class GradingClient {

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        String fullName, subject, className, result;
        float firstTest, secondTest, exam;

        // Collect input from user using Scanner class
        Scanner scanner = new Scanner(System.in);

        // Prompt user to provide details and initialize the details to their respective variable names
        System.out.println("Enter your full name...");
        fullName = scanner.nextLine();

        System.out.println("Enter your class name...");
        className = scanner.nextLine();

        System.out.println("Enter subject name...");
        subject = scanner.nextLine();

        System.out.println("Enter your 1st test score...");
        firstTest = scanner.nextFloat();
        while (firstTest > 15.00) {
            System.out.println("1st test score must not be more than 15, re-enter your score...");
            firstTest = scanner.nextFloat();
        }

        System.out.println("Enter your 2nd test score...");
        secondTest = scanner.nextFloat();
        while (secondTest > 15.00) {
            System.out.println("2nd test score must not be more than 15, re-enter your score...");
            secondTest = scanner.nextFloat();
        }

        System.out.println("Enter your exam score...");
        exam = scanner.nextFloat();
        while (exam > 70.00) {
            System.out.println("Exam score must not be more than 70, re-enter your score...");
            exam = scanner.nextFloat();
        }

        // Instantiate Grading class to create grading object
        Grading grading = new Grading();
        grading.setFullName(fullName);
        grading.setClassName(className);
        grading.setSubject(subject);
        grading.setFirstTest(firstTest);
        grading.setSecondTest(secondTest);
        grading.setExam(exam);

        // Compute student's details, score and final grade.
        result = grading.toString();

        // Display student's result
        System.out.println(result);
    }
}
