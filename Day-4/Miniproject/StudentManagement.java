import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> ids = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> marks = new ArrayList<>();

        LinkedList<String> attendance = new LinkedList<>();

        int choice;

        do {
            System.out.println("\n====================================");
            System.out.println("       STUDENT MANAGEMENT SYSTEM");
            System.out.println("====================================");

            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student Marks");
            System.out.println("5. Remove Student");
            System.out.println("6. Add Student Attendance");
            System.out.println("7. Display Attendance");
            System.out.println("8. Remove Attendance");
            System.out.println("9. Display Student Statistics");
            System.out.println("10. Sort Student Names");
            System.out.println("11. Exit");

            System.out.print("\nEnter Your Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    if (ids.contains(id)) {
                        System.out.println("Student ID already exists!");
                        break;
                    }

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Student Marks: ");
                    int mark = sc.nextInt();
                    sc.nextLine();

                    if (mark < 0 || mark > 100) {
                        System.out.println("Invalid Marks! Enter between 0 and 100.");
                    } else {
                        ids.add(id);
                        names.add(name);
                        marks.add(mark);

                        System.out.println("Student Added Successfully!");
                    }
                    break;

                case 2:
                    if (names.isEmpty()) {
                        System.out.println("No Student Records Found!");
                    } else {
                        System.out.println("\n--------- STUDENT RECORDS ---------");
                        System.out.println("ID\tName\t\tMarks");

                        for (int i = 0; i < names.size(); i++) {
                            System.out.println(ids.get(i) + "\t" +
                                    names.get(i) + "\t\t" + marks.get(i));
                        }

                        System.out.println("Total Students: " + names.size());
                    }
                    break;

                case 3:
                    System.out.print("Enter Student Name: ");
                    name = sc.nextLine();

                    int index = names.indexOf(name);

                    if (index != -1) {
                        System.out.println("\nStudent Found!");
                        System.out.println("ID: " + ids.get(index));
                        System.out.println("Name: " + names.get(index));
                        System.out.println("Marks: " + marks.get(index));
                    } else {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Student Name: ");
                    name = sc.nextLine();

                    index = names.indexOf(name);

                    if (index != -1) {
                        System.out.print("Enter New Marks: ");
                        mark = sc.nextInt();
                        sc.nextLine();

                        if (mark >= 0 && mark <= 100) {
                            marks.set(index, mark);
                            System.out.println("Student Marks Updated Successfully!");
                        } else {
                            System.out.println("Invalid Marks!");
                        }
                    } else {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 5:
                    System.out.print("Enter Student Name: ");
                    name = sc.nextLine();

                    index = names.indexOf(name);

                    if (index != -1) {
                        ids.remove(index);
                        names.remove(index);
                        marks.remove(index);

                        System.out.println("Student Removed Successfully!");
                    } else {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 6:
                    System.out.print("Enter Student Name: ");
                    name = sc.nextLine();

                    if (!names.contains(name)) {
                        System.out.println("Student Does Not Exist!");
                        break;
                    }

                    if (attendance.contains(name)) {
                        System.out.println("Student Already Marked Present!");
                        break;
                    }

                    System.out.println("1. Add at Beginning");
                    System.out.println("2. Add at End");
                    System.out.print("Enter Your Choice: ");
                    int position = sc.nextInt();
                    sc.nextLine();

                    if (position == 1) {
                        attendance.addFirst(name);
                        System.out.println("Attendance Added at Beginning!");
                    } else if (position == 2) {
                        attendance.addLast(name);
                        System.out.println("Attendance Added at End!");
                    } else {
                        System.out.println("Invalid Choice!");
                    }
                    break;

                case 7:
                    if (attendance.isEmpty()) {
                        System.out.println("No Students Present!");
                    } else {
                        System.out.println("\n--------- ATTENDANCE LIST ---------");

                        for (int i = 0; i < attendance.size(); i++) {
                            System.out.println(attendance.get(i));
                        }

                        System.out.println("Total Present Students: " +
                                attendance.size());
                    }
                    break;

                case 8:
                    System.out.print("Enter Student Name: ");
                    name = sc.nextLine();

                    if (attendance.contains(name)) {
                        attendance.remove(name);
                        System.out.println("Attendance Removed Successfully!");
                    } else {
                        System.out.println("Student Not Found in Attendance!");
                    }
                    break;

                case 9:
                    if (marks.isEmpty()) {
                        System.out.println("No Student Records Found!");
                    } else {
                        int highest = Collections.max(marks);
                        int lowest = Collections.min(marks);

                        int total = 0;
                        int count = 0;

                        for (int i = 0; i < marks.size(); i++) {
                            total = total + marks.get(i);

                            if (marks.get(i) > 75) {
                                count++;
                            }
                        }

                        double average = (double) total / marks.size();

                        System.out.println("\n--------- STUDENT STATISTICS ---------");
                        System.out.println("Total Students: " + marks.size());
                        System.out.println("Highest Marks: " + highest);
                        System.out.println("Lowest Marks: " + lowest);
                        System.out.println("Average Marks: " + average);
                        System.out.println("Students Above 75: " + count);
                    }
                    break;

                case 10:
                    if (names.isEmpty()) {
                        System.out.println("No Student Records Found!");
                    } else {
                        ArrayList<String> sortedNames = new ArrayList<>(names);

                        Collections.sort(sortedNames);

                        System.out.println("\nNames in Alphabetical Order:");
                        System.out.println(sortedNames);

                        Collections.reverse(sortedNames);

                        System.out.println("Names in Reverse Order:");
                        System.out.println(sortedNames);
                    }
                    break;

                case 11:
                    System.out.println("Thank You!");
                    System.out.println("Exiting Student Management System...");
                    break;

                default:
                    System.out.println("Invalid Choice! Try Again.");
            }

        } while (choice != 11);

        sc.close();
    }
}