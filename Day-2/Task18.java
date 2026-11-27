class Student {
    String name;
    double marks;

    Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    void showResult() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class Task18 {
    public static void main(String[] args) {

        Student s1 = new Student("Komala", 90.5);
        Student s2 = new Student("Rahul", 85.5);

        s1.showResult();
        s2.showResult();
    }
}