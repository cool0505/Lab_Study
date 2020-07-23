
public class Faculty {
	String name;
	int uID;
	String major;
	Course[] teachingSubjects = new Course[3];
	
	Faculty (String n, int id, String m) {
		this.name = n;
		this.uID = id;
		this.major = m;
	}
	void addCourse(String name, University u) {  //교과목 명을 넘겨받아 배열에 넣음.
		
	}
}
