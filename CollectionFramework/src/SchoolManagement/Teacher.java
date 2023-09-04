package SchoolManagement;

public class Teacher extends School {
	
	private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Subject: " + subject + ", " + super.toString();
    }

}
