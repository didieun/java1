package Chapter10;
class Student2 {
	String name = "펭수";
	int age = 20;
	String major = "펭귄학과";
	
	public void printStudentInfo() {
		System.out.println("성함: " + name);
		System.out.println("나이: " + age);
		System.out.println("학과: " + major);
	}
}
public class Quiz2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 펭수 = new Student2();
		펭수.printStudentInfo();
	}
}