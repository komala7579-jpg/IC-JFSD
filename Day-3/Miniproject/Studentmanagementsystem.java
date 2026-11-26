
import java.util.Scanner;

import java.util.Scanner;

class StudentManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student s = new Student(0, null, null);

        int choice;

        do {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display Student");
            System.out.println("3. Enter Marks");
            System.out.println("4. Calculate Total");
            System.out.println("5. Calculate Average");
            System.out.println("6. Calculate Grade");
            System.out.println("7. Pass/Fail");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    s.addStudent(sc);
                    break;

                case 2:
                    s.displayStudent();
                    break;

                case 3:
                    s.enterMarks(sc);
                    break;

                case 4:
                    s.total();
                    break;

                case 5:
                    s.avg();
                    break;

                case 6:
                    s.grade();
                    break;

                case 7:
                    s.result();
                    break;

                case 8:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Enter a valid number");
            }

        } while (choice != 8);

        sc.close();
    }
}


class Student {
    int studentId;
    String studentName;
    String department;
    int marks1, marks2, marks3;

    Student(int id, String name, String dept) {
        studentId = id;
        studentName = name;
        department = dept;
    }

    void addStudent(Scanner sc) {
        System.out.print("Enter Student ID: ");
        studentId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();

        System.out.print("Enter Department: ");
        department = sc.nextLine();

        System.out.println("Student added successfully");
    }

    void displayStudent() {

        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;

        String grade;

        if (average >= 90)
            grade = "A";
        else if (average >= 75)
            grade = "B";
        else if (average >= 60)
            grade = "C";
        else if (average >= 40)
            grade = "D";
        else
            grade = "F";

        String result;

        if (marks1 >= 35 && marks2 >= 35 && marks3 >= 35)
            result = "Pass";
        else
            result = "Fail";

        System.out.println("\n----- Student Details -----");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Department: " + department);
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Marks 3: " + marks3);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + result);
    }

    void enterMarks(Scanner sc) {
        System.out.print("Enter marks 1: ");
        marks1 = sc.nextInt();

        System.out.print("Enter marks 2: ");
        marks2 = sc.nextInt();

        System.out.print("Enter marks 3: ");
        marks3 = sc.nextInt();
    }

    void total() {
        int total = marks1 + marks2 + marks3;
        System.out.println("Total: " + total);
    }

    void avg() {
        double average = (marks1 + marks2 + marks3) / 3.0;
        System.out.println("Average: " + average);
    }

    void grade() {
        double average = (marks1 + marks2 + marks3) / 3.0;

        if (average >= 90)
            System.out.println("Grade: A");
        else if (average >= 75)
            System.out.println("Grade: B");
        else if (average >= 60)
            System.out.println("Grade: C");
        else if (average >= 40)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: F");
    }

    void result() {
        if (marks1 >= 35 && marks2 >= 35 && marks3 >= 35)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");
    }
}
