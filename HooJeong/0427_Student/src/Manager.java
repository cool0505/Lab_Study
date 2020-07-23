
public class Manager {
	University myUniv = new University();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager myManager = new Manager();
		myManager.startUnivSystem();
		myManager.initiateCourses();
	}

	void startUnivSystem() {
		myUniv.setUnivName();
		myUniv.addCourse();
		myUniv.addFaculty();
		myUniv.addStudent();
	}
	
	void initiateCourses() {
			
	}
}
