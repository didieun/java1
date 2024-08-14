package Chapter7;

class Person {
	String name = "송일국";
	int age = 52;
	boolean isMarried = true;
	int numberOfChildren = 3;
}

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		
		System.out.println("이름: " + person.name);
		System.out.println("나이: " + person.age);
		System.out.println("결혼 여부: " + person.isMarried);
		System.out.println("자녀 수: " + person.numberOfChildren);
	}

}