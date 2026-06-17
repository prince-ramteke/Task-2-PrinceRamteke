import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("      STUDENT GRADE CALCULATOR");
        System.out.println("==================================");

        System.out.print("Enter Number of Subjects: ");
        int numberOfSubjects = sc.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= numberOfSubjects; i++) {

            System.out.print("Enter Marks for Subject " + i + " (0-100): ");
            int marks = sc.nextInt();

            totalMarks += marks;
        }

        double percentage = (double) totalMarks / numberOfSubjects;

        String grade;

        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\n==================================");
        System.out.println("             RESULT");
        System.out.println("==================================");

        System.out.println("Total Marks : " + totalMarks);
        System.out.printf("Percentage  : %.2f%%\n", percentage);
        System.out.println("Grade       : " + grade);

        sc.close();
    }
}