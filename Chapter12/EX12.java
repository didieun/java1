package Chapter12;

class UserException2 extends RuntimeException {
	// 실행 예외 생성( 실행 예외는 RuntimeException 상속 받으면 됨.)
}

class ExceptionTest2 {
	public void printName(String name) {
		if ("펭수".equals(name)) {
			throw new UserException2();
		}
		System.out.println(name + "님 안녕하세요.");
		System.out.println(name + "님 반갑습니다.");
		System.out.println(name + "님 또 만나요.");
	}
}

public class EX12 {

	public static void main(String[] args) {
		// 예외 직접 만들기2
		ExceptionTest2 et2 = new ExceptionTest2();
		et2.printName("펭수");
		et2.printName("범이");

	}

}
