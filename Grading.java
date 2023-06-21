package exercises;

/**
 * Constructor class
 *
 * @author MOPHE
 */
public class Grading {

    // Private variables to be accessed only by Grading class
    private String fullName;
    private String subject;
    private String className;
    private float firstTest;
    private float secondTest;
    private float exam;
    private float total;
    private char grade;

    // Empty constructor
    public Grading() {
    }

    // Parameterized constructor
    public Grading(String fullName, String subject, String className, float firstTest, float secondTest, float exam, float total) {
        this.fullName = fullName;
        this.subject = subject;
        this.className = className;
        this.firstTest = firstTest;
        this.secondTest = secondTest;
        this.exam = exam;
        this.total = total;
    }

    // Getters and Setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public float getFirstTest() {
        return firstTest;
    }

    public void setFirstTest(float firstTest) {
        this.firstTest = firstTest;
    }

    public float getSecondTest() {
        return secondTest;
    }

    public void setSecondTest(float secondTest) {
        this.secondTest = secondTest;
    }

    public float getExam() {
        return exam;
    }

    public void setExam(float exam) {
        this.exam = exam;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    /**
     * Method to compute student's grade from provided scores and return the
     * grade.
     *
     * @return grade
     */
    private char computeGrade() {
        char grade;
        float cummulative;
        float firstTest = this.getFirstTest();
        float secondTest = this.getSecondTest();
        float exam = this.getExam();

        cummulative = firstTest + secondTest + exam;

        if (cummulative >= 70.00) {
            grade = 'A';
        } else if (cummulative >= 60.00) {
            grade = 'B';
        } else if (cummulative >= 50.00) {
            grade = 'C';
        } else if (cummulative >= 45.00) {
            grade = 'D';
        } else if (cummulative >= 40.00) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        return grade;
    }

    /**
     * Method to compute student's total score.
     *
     * @return total score
     */
    private float computeTotal() {
        float firstTest = this.getFirstTest();
        float secondTest = this.getSecondTest();
        float exam = this.getExam();

        return firstTest + secondTest + exam;
    }

    /**
     * Method to print out student's result in a formatted output.
     *
     * @return result
     */
    @Override
    public String toString() {
        return """
               Your result is:
               Full Name:\t""" + fullName + "\nSubject:\t\t"
                + subject + "\nClass:\t\t" + className + "\n1st Test:\t" + firstTest
                + "\n2nd Test:\t" + secondTest + "\nExam:\t\t" + exam
                + "\nTotal:\t\t" + computeTotal() + "\nYour grade is:\t" + computeGrade();
    }
}
