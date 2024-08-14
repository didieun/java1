package Chapter7;

class Student {
	public void studentAvrScore(String name, int kor, int eng, int math) {
		int avr = (kor + eng + math)/3;
		System.out.println(name + "의 성적 평균은 " + avr + "입니다.");
	}
}

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		
		student.studentAvrScore("장원영", 100, 100, 100);
		student.studentAvrScore("안유진", 90, 90, 90);
		student.studentAvrScore("가을", 80, 80, 80);
	}

}