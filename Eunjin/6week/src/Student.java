
public class Student {
	
	String name = "ȫ�浿";
	String studentNum = "2020430000";
	String department = "��ȣ�а�";	//static�� ����ϸ�, main���� �����ڷ� ��ü �������� �ʾƵ� Student.department�� ��� ����
	
	public Student() {
	}
	
	public Student(String name, String studentNum, String department) {
		this.name = name;
		this.studentNum = studentNum;
		this.department = department;
	}

	public String getName() {				//getter : ������ ���� ���� ��
		return name;
	}

	public void setName(String name) {		//setter : ������ ���� ���� ��
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