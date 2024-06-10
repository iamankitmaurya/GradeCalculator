import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome your in codsoft intern project");
        Scanner scanner = new Scanner(System.in);

        final double A_GRADE_THRESHOLD = 80.0;
        final double B_GRADE_THRESHOLD = 60.0;
        final double C_GRADE_THRESHOLD = 40.0;

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Input marks for each subject
        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for Subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numSubjects;

        // Determine grade based on average percentage
        char grade;
        if (averagePercentage >= A_GRADE_THRESHOLD) {
            grade = 'A';
        } else if (averagePercentage >= B_GRADE_THRESHOLD) {
            grade = 'B';
        } else if (averagePercentage >= C_GRADE_THRESHOLD) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        // Display results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
