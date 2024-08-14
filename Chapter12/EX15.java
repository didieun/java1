package Chapter12;

class UserException5 extends Exception {
	// 컴파일 예외 생성( Exception 은 모든 예외.)
}

class ExceptionTest5 {
	public void printName(String name) throws UserException5 {
		if ("펭수".equals(name)) {
			throw new UserException5();
		}
		System.out.println(name + "님 안녕하세요.");
		System.out.println(name + "님 반갑습니다.");
		System.out.println(name + "님 또 만나요.");
	}
}

public class EX15 {

	public static void main(String[] args) {
		// 예외 던지기
		ExceptionTest5 et5 = new ExceptionTest5();
//		et5.printName("펭수");
//		et5.printName("범이");
		
		//에러 EX16 확인

	}

}
