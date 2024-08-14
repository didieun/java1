package Chapter9;

public class EX01 {

	static int classVariable = 100; // 클래스 변수
	int instanceVariable = 200; // 인스턴스 변수
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int localVariable = 300; // 지역 변수
		
		System.out.println("클래스 변수: " + classVariable);
//		System.out.println("인스턴스 변수: " + instanceVariable); // 에러나는경우 -> 객체를 생성해야됨, 해결방법 -> EX02
		System.out.println("지역 변수: " + localVariable);

	}

}
