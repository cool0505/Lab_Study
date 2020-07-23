
public class University {
	String univName;
	Student[] students = new Student[100];
	int numStudents = 0;
	Faculty[] faculties = new Faculty[100];
	int numFaculties = 0;
	Course[] courses = new Course[100];
	int numCourses = 0;
	InputModule im = new InputModule();
	
	void setUnivName() {
		this.univName = im.getUniversityInformation();
	}
	
	void addCourse() {
		courses[numCourses] = im.getCourseInformation();
		numCourses ++;
	}
	
	void addStudent() {
		students[numStudents] = im.getStudentInformation();
		numStudents ++;
	}
	
	void addFaculty() {
		faculties[numFaculties] = im.getFacultyInformation();
		numFaculties ++;
	}
	
	Student searchByStudentID(int id) {
		Student find = null;
		for(int i=0;i<numStudents; i++) {
			if(students[i].sID == id) {
				find = students[i];
				break;	
			}
		}
		return find;
	}
	
	Faculty searchByFacultyID(int id) {
		Faculty find = null;
		for(int i=0; i<numFaculties; i++) {
			if(faculties[i].uID == id) {
				find = faculties[i];
				break;
			}
		}
		return find;
	}
	
	Course searchByCourseName(String cname) {
		Course find = null;
		for(int i=0; i<numCourses; i++) {
			if(courses[i].courseName.equals(cname)) {
				find = courses[i];
				break;
			}
		}
		return find;
	}
}

