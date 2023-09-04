package HospitalManagement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hospitalinfo {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer,Patient>patientRecords = new HashMap<>();

        while (true) {
            System.out.println("Hospital Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patient Details");
            System.out.println("3. Search Patient by ID");
            System.out.println("4. List All Patients");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter patient ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter patient name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter patient age: ");
                    int age = scanner.nextInt();
                    Patient patient = new Patient(id, name, age);
                    patientRecords.put(id, patient);
                    System.out.println("Patient added successfully!");
                    break;

                case 2:
                    System.out.print("Enter patient ID: ");
                    int viewId = scanner.nextInt();
                    if (patientRecords.containsKey(viewId)) {
                        System.out.println(patientRecords.get(viewId));
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter patient ID: ");
                    int searchId = scanner.nextInt();
                    if (patientRecords.containsKey(searchId)) {
                        System.out.println(patientRecords.get(searchId));
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 4:
                    for (Patient p : patientRecords.values()) {
                        System.out.println(p);
                    }
                    break;

                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
   }
}
