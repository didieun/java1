package Chapter10;
class Student1 {
	String name = "펭수";
	int age = 20;
	String major = "펭귄학과";
}
public class Quiz1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 펭수 = new Student1();
		System.out.println("성함: " + 펭수.name);
		System.out.println("나이: " + 펭수.age);
		System.out.println("학과: " + 펭수.major);
	}
}