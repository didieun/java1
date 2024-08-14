package Chapter7;

class StudentReturn {
	public String studentAvrScore(String name, int kor, int eng, int math) {
		int avr = (kor + eng + math)/3;
		return name + "의 성적 평균은 " + avr + "입니다.";
	}
}

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentReturn student = new StudentReturn();
		
		String student1 = student.studentAvrScore("장원영", 100, 100, 100);
		String student2 = student.studentAvrScore("안유진", 90, 90, 90);
		String student3 = student.studentAvrScore("가을", 80, 80, 80);
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
	}

}