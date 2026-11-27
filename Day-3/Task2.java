class StudentName {
    String name = "Saran Velmurugan";
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Total characters: " + name.length());
        System.out.println("First character: " + name.charAt(0));
        System.out.println("Last character: " + name.charAt(name.length() - 1));
        System.out.println("Fifth character: " + name.charAt(4));
    }
}

public class Task2 {
    public static void main(String[] args) {
        StudentName s = new StudentName();
        s.display();
    }
}