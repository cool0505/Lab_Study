import java.util.Scanner;

public class InputModule {
	Scanner scn = new Scanner(System.in);
	
	Faculty getFacultyInformation() {
		Faculty faculty;
		String fname;
		int id;
		String major;
		
		System.out.println("========== 교수정보 생성 ==========");
		System.out.println("교수 이름을 입력하시오 : ");
		fname = this.getString();
		System.out.println("교수 번호를 입력하시오 : ");
		id = this.getInteger();
		scn.nextLine();
		System.out.println("교수 전공을 입력하시오 : ");
		major = this.getString();
	
		faculty = new Faculty(fname, id, major);
		
		return faculty;
	}
	
	String getUniversityInformation() {
		String name;
		System.out.println("대학명을 입력하시오 : ");
		name = scn.nextLine();
		return name;
	}
	
	Student getStudentInformation() {
		Student student;
		String sname;
		int id;
		String major;
		
		System.out.println("========== 학생정보 생성 ==========");
		System.out.println("이름을 입력하시오 : ");
		sname = this.getString();
		System.out.println("학번을 입력하시오 : ");
		id = this.getInteger();
		scn.nextLine();
		System.out.println("전공을 입력하시오 : ");
		major = this.getString();
	
		student = new Student(sname, id, major);
		
		return student;
	}
	
	Course getCourseInformation() {
		Course course;
		String cname;
		String dname;
		String fname;
		
		System.out.println("========== 교과목 생성 ==========");
		System.out.println("교과목명을 입력하시오 : ");
		cname = this.getString();
		System.out.println("학과명을 입력하시오 : ");
		dname = this.getString();
		System.out.println("담당 교수명을 입력하시오 : ");
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
