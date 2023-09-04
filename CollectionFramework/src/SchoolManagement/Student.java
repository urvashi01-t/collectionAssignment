package SchoolManagement;

public class Student extends School {
	
	private int studentId;

	   public Student( String name, int age,int studentId)
	   {
		   super(name,age);
	 	   this.studentId=studentId;
	   }
	    public int getStudentId() {
	        return studentId;
	    }

	    @Override
	    public String toString() {
	        return  "Student ID: " + studentId + ", " + super.toString();
	    }

}
