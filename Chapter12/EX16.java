package Chapter12;

class UserException6 extends Exception {
	// 컴파일 예외 생성( Exception 은 모든 예외.)
}

class ExceptionTest6 {
	public void printName(String name) throws UserException6 {
		if ("펭수".equals(name)) {
			throw new UserException6();
		}
		System.out.println(name + "님 안녕하세요.");
		System.out.println(name + "님 반갑습니다.");
		System.out.println(name + "님 또 만나요.");
	}
}

public class EX16 {

	public static void main(String[] args) {
		// 예외 던지기
		ExceptionTest6 et6 = new ExceptionTest6();
		
		try {
			et6.printName("펭수");
			et6.printName("범이");

		} catch (UserException6 e) {
			System.out.println("UserException6 이 발생했습니다.");
		}
		
	}
}
