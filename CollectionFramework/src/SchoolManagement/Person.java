package SchoolManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSchool Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. Display Students");
            System.out.println("4. Display Teachers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine(); 
                    System.out.print("Enter Student Name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter Student Age: ");
                    int studentAge = scanner.nextInt();
                    System.out.print("Enter Student ID: ");
                    int studentId = scanner.nextInt();

                    Student student = new Student(studentName, studentAge, studentId);
                    students.add(student);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    scanner.nextLine(); // Consume the newline
                    System.out.print("Enter Teacher Name: ");
                    String teacherName = scanner.nextLine();
                    System.out.print("Enter Teacher Age: ");
                    int teacherAge = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    System.out.print("Enter Subject: ");
                    String subject = scanner.nextLine();

                    Teacher teacher = new Teacher(teacherName, teacherAge, subject);
                    teachers.add(teacher);
                    System.out.println("Teacher added successfully!");
                    break;

                case 3:
                    System.out.println("List of Students:");
                    for (Student stu : students) {
                        System.out.println(stu);
                    }
                    break;

                case 4:
                    System.out.println("List of Teachers:");
                    for (Teacher tea : teachers) {
                        System.out.println(tea);
                    }
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

}
