package ProjectManagement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProjectManagementInfo {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, ProjectManagement> projects = new HashMap<>();

        while (true) {
            System.out.println("Project Management System");
            System.out.println("1. Add Project");
            System.out.println("2. Assign Team Member");
            System.out.println("3. View Project Details");
            System.out.println("4. List All Projects");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter project name: ");
                    String projectName = scanner.nextLine();
                    System.out.print("Enter project description: ");
                    String projectDescription = scanner.nextLine();
                    ProjectManagement project = new ProjectManagement(projectName, projectDescription);
                    projects.put(projectName, project);
                    System.out.println("Project added successfully!");
                    break;

                case 2:
                    System.out.print("Enter project name: ");
                    String projectNameForAssignment = scanner.nextLine();
                    if (projects.containsKey(projectNameForAssignment)) {
                    	ProjectManagement assignProject = projects.get(projectNameForAssignment);
                        System.out.print("Enter team member name: ");
                        String teamMemberName = scanner.nextLine();
                        assignProject.addTeamMember(teamMemberName);
                        System.out.println("Team member assigned successfully!");
                    } else {
                        System.out.println("Project not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter project name: ");
                    String viewProjectName = scanner.nextLine();
                    if (projects.containsKey(viewProjectName)) {
                        System.out.println(projects.get(viewProjectName));
                    } else {
                        System.out.println("Project not found.");
                    }
                    break;

                case 4:
                    for (ProjectManagement p : projects.values()) {
                        System.out.println(p.getProjectName());
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
