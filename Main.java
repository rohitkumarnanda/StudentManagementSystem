import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        System.out.println("=================================");
        System.out.println("      STUDENT MANAGEMENT SYSTEM");
        System.out.println("=================================");

        while (true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();

                    Student student =
                            new Student(id, name, age, course);

                    manager.addStudent(student);

                    break;

                case 2:

                    manager.displayAllStudents();

                    break;

                case 3:

                    System.out.print("Enter Student ID to search: ");
                    int searchId = scanner.nextInt();

                    manager.searchStudent(searchId);

                    break;

                case 4:

                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = scanner.nextInt();

                    manager.deleteStudent(deleteId);

                    break;

                case 5:

                    System.out.println("Thank you for using Student Management System!");

                    scanner.close();

                    return;

                default:

                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}