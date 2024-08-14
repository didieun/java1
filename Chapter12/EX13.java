package Chapter12;

class UserException3 extends Exception {
	// 컴파일 예외 생성( Exception 은 모든 예외.)
}

class ExceptionTest3 {
	public void printName(String name) {
		if ("펭수".equals(name)) {
//			throw new UserException3();
			// 컴파일 에러는 미리 예외가 발생할거라고 알려줌
			// 처리는 EX14 확인!
		}
		System.out.println(name + "님 안녕하세요.");
		System.out.println(name + "님 반갑습니다.");
		System.out.println(name + "님 또 만나요.");
	}
}

public class EX13 {

	public static void main(String[] args) {
		// 예외 직접 만들기3
		ExceptionTest3 et3 = new ExceptionTest3();
		et3.printName("펭수");
		et3.printName("범이");

	}

}
