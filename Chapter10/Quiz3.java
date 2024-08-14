package Chapter10;
class Student3 {
	String name = "펭수";
	int age = 20;
	String major = "펭귄학과";
	
	public void printStudentInfo() {
		System.out.println("성함: " + name);
		System.out.println("나이: " + age);
		System.out.println("학과: " + major);
	}
	
	void startStudying() {
		System.out.println(major + " 학과 " + name + " 님이 공부를 시작합니다.");
	}
}
public class Quiz3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 펭수 = new Student3();
		펭수.startStudying();
	}
}