package Chapter12;

class UserException4 extends Exception {
	// 컴파일 예외 생성( Exception 은 모든 예외.)
}

class ExceptionTest4 {
	public void printName(String name) {
		// 예외 처리
		try {
			if ("펭수".equals(name)) {
				throw new UserException4();	
			}
			
			System.out.println(name + "님 안녕하세요.");
			System.out.println(name + "님 반갑습니다.");
			System.out.println(name + "님 또 만나요.");
		} catch(UserException4 e) {
			System.out.println("UserException4 이 발생했습니다.");
		}
	}
}

public class EX14 {

	public static void main(String[] args) {
		// 예외 처리
		ExceptionTest4 et4 = new ExceptionTest4();
		et4.printName("펭수");
		et4.printName("범이");
		
	}
}
