
public class Practice {
	
	public static void main(String[] args) {
		
//		String str = Student.department;	//static으로 선언했을 때
//		System.out.println(str);
		
		Student stu1 = new Student();
		System.out.println(stu1.name);
		System.out.println(stu1.studentNum);
		System.out.println(stu1.department);
		
		Student stu2 = new Student("신은진", "2019243044", "컴퓨터공학부");
		
		System.out.println(stu2.name);
		System.out.println(stu2.studentNum);
		System.out.println(stu2.department);
		
		System.out.println(stu2.getName());
		System.out.println(stu2.getStudentNum());
		System.out.println(stu2.getDepartment());
		
	}
	
}
