package EmployeeRecord;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {
	private String name;
	private int id;
	private String department;
	private double salary;

	Employee(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return "Employee [" + "Id: " + id + " Name: " + name + " Department: " + department + "Salary: " + salary + "]";
	}
	
	
	public static void main(String [] args) {
		 
		List<Employee> al = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("\nEmployee Management System");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employee Details");
			System.out.println("3. Search Employee by ID");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			System.out.println("Enter your choice: ");
			String input = sc.next();
			switch (input) {
			case "1":
				System.out.println("Enter employee Id: ");
				int id2 = sc.nextInt();
				System.out.println("Enter employee name: ");
				String name2 = sc.next();
				System.out.println("Enter employee Department: ");
				String department2 = sc.next();
				System.out.println("Enter employee Salary: ");
				double salary2 = sc.nextDouble();
				Employee employee = new Employee(id2, name2, department2, salary2);
				al.add(employee);
				break;
			case "2":
				System.out.println("Employee Details");
				for (Employee emp : al) {
					System.out.println(emp);
				}
				break;
			case "3":
				System.out.println("Enter employe Id to search details ");
				int search = sc.nextInt();
				boolean bool = false;
				for (Employee emp : al) {
					if (emp.getId() == search) {
						System.out.println("Employee found: " + emp);
						bool = true;
						break;
					}
				}
				if (!bool) {
					System.out.println("Employee with ID " + search + " not found.");
				}
				break;
			case "4":
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice. Please select a valid option.");
				break;
			}
		}
	}

}

	