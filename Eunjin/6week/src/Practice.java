
public class Practice {
	
	public static void main(String[] args) {
		
//		String str = Student.department;	//static���� �������� ��
//		System.out.println(str);
		
		Student stu1 = new Student();
		System.out.println(stu1.name);
		System.out.println(stu1.studentNum);
		System.out.println(stu1.department);
		
		Student stu2 = new Student("������", "2019243044", "��ǻ�Ͱ��к�");
		
		System.out.println(stu2.name);
		System.out.println(stu2.studentNum);
		System.out.println(stu2.department);
		
		System.out.println(stu2.getName());
		System.out.println(stu2.getStudentNum());
		System.out.println(stu2.getDepartment());
		
	}
	
}
