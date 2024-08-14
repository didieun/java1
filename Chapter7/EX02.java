package Chapter7;

// method(메소드)

// 1. 긴코드 축약
class Hi {
	// 접근 제어자 반환타입 (반환티입이 없으면 void 를 사용) 메서드명()
	// public -> 접근 제어자
	public void MethodTest_EX02() {
		System.out.println("안녕하세요");
		System.out.println("반갑습니다");
		System.out.println("또 만나요");
	}
}

public class EX02 {

	public static void main(String[] args) {
		// 1. hi 객체 생성
		Hi hi = new Hi();
		
		// 2. 메소드 호출()
		hi.MethodTest_EX02();
		hi.MethodTest_EX02();
		hi.MethodTest_EX02();
	}

}
