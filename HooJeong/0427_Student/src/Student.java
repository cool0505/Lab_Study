
public class Student {
	String name;
	int sID;
	String major;
	Course[] registeredSubjects = new Course[8];
	int numberOFRegisteredSubjects = 0;
	
	Student (String n, int id, String m){
		this.name = n;
		this.sID = id;
		this.major = m;
	}

	void addCourse(String name) {
		
	}
}
