import java.util.Scanner;

public class InputModule {
	Scanner scn = new Scanner(System.in);
	
	Faculty getFacultyInformation() {
		Faculty faculty;
		String fname;
		int id;
		String major;
		
		System.out.println("========== �������� ���� ==========");
		System.out.println("���� �̸��� �Է��Ͻÿ� : ");
		fname = this.getString();
		System.out.println("���� ��ȣ�� �Է��Ͻÿ� : ");
		id = this.getInteger();
		scn.nextLine();
		System.out.println("���� ������ �Է��Ͻÿ� : ");
		major = this.getString();
	
		faculty = new Faculty(fname, id, major);
		
		return faculty;
	}
	
	String getUniversityInformation() {
		String name;
		System.out.println("���и��� �Է��Ͻÿ� : ");
		name = scn.nextLine();
		return name;
	}
	
	Student getStudentInformation() {
		Student student;
		String sname;
		int id;
		String major;
		
		System.out.println("========== �л����� ���� ==========");
		System.out.println("�̸��� �Է��Ͻÿ� : ");
		sname = this.getString();
		System.out.println("�й��� �Է��Ͻÿ� : ");
		id = this.getInteger();
		scn.nextLine();
		System.out.println("������ �Է��Ͻÿ� : ");
		major = this.getString();
	
		student = new Student(sname, id, major);
		
		return student;
	}
	
	Course getCourseInformation() {
		Course course;
		String cname;
		String dname;
		String fname;
		
		System.out.println("========== ������ ���� ==========");
		System.out.println("��������� �Է��Ͻÿ� : ");
		cname = this.getString();
		System.out.println("�а����� �Է��Ͻÿ� : ");
		dname = this.getString();
		System.out.println("��� �������� �Է��Ͻÿ� : ");
		fname = this.getString();
		
		course = new Course(cname, dname, fname);
		return course;
	}
	
	int getInteger() {
		return scn.nextInt();
	}
	
	String getString() {
		return scn.nextLine();
	}
}
