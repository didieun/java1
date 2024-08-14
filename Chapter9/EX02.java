package Chapter9;

public class EX02 {

	static int classVariable = 100; // 클래스 변수
	int instanceVariable = 200; // 인스턴스 변수
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int localVariable = 300; // 지역 변수
		
		EX02 lv = new EX02();
		System.out.println("클래스 변수: " + classVariable); // 객체 생성안해도 사용가능
		System.out.println("인스턴스 변수: " + lv.instanceVariable); // 객체를 생성해야지만 사용할수 있음
		System.out.println("지역 변수: " + localVariable); // 지역변수도 그 안에서 사용하기때문에 사용가능

	}

}
