package test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 定义 Student 类


public class StudentMannger {
    private static List<Student> students = new ArrayList<>();//List类
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Update Student");
            System.out.println("4. Query Student");
            System.out.println("5. Exit");
            System.out.print("Please choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    deleteStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    queryStudent();
                    break;
                case 5:
                    System.out.println("Exiting the system...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        Student student = new Student(id, name, age);
        students.add(student);//添加用户
        System.out.println("Student added successfully.");
    }

    private static void deleteStudent() {
        System.out.print("Enter student ID to delete: ");
        String id = scanner.nextLine();
        students.removeIf(student -> student.getId().equals(id));//删除用户
        System.out.println("Student deleted successfully.");
    }

    private static void updateStudent() {
        System.out.print("Enter student ID to update: ");
        String id = scanner.nextLine();
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.print("Enter new student name: ");
                String name = scanner.nextLine();
                System.out.print("Enter new student age: ");
                int age = scanner.nextInt();
                scanner.nextLine();
                student.setName(name);
                student.setAge(age);
                System.out.println("Student updated successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    private static void queryStudent() {
        System.out.print("Enter student ID to query: ");
        String id = scanner.nextLine();
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student not found.");
    }
}