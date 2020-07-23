
public class Student {
	
	String name = "홍길동";
	String studentNum = "2020430000";
	String department = "간호학과";	//static을 사용하면, main에서 생성자로 객체 선언하지 않아도 Student.department로 사용 가능
	
	public Student() {
	}
	
	public Student(String name, String studentNum, String department) {
		this.name = name;
		this.studentNum = studentNum;
		this.department = department;
	}

	public String getName() {				//getter : 변수의 값을 읽을 때
		return name;
	}

	public void setName(String name) {		//setter : 변수에 값을 넣을 때
		this.name = name;
	}

	public String getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	//
	
	public Student(String name) {
		super();
		this.name = name;
	}

	public Student(String name, String studentNum) {
		super();
		this.name = name;
		this.studentNum = studentNum;
	}
	
	
	
	
}