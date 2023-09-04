package ProjectManagement;

import java.util.HashSet;
import java.util.Set;

public class ProjectManagement {

	private String projectName;
    private String projectDescription;
    private Set<String> teamMembers;

    public ProjectManagement(String projectName, String projectDescription) {
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.teamMembers = new HashSet<>();
    }

    public String getProjectName() {
        return projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public Set<String> getTeamMembers() {
        return teamMembers;
    }

    public void addTeamMember(String memberName) {
        teamMembers.add(memberName);
    }

    @Override
    public String toString() {
        return "Project Name: " + projectName +
                "\nDescription: " + projectDescription +
                "\nTeam Members: " + teamMembers;
    }
}
