package Chapter12;

class ExceptionTest1 {
	public void printName(String name) {
		if ("펭수".equals(name)) {
			return; // 리턴하면 메소드 밖으로 빠져 나감
		}
		System.out.println(name + "님 안녕하세요.");
		System.out.println(name + "님 반갑습니다.");
		System.out.println(name + "님 또 만나요.");
	}
}

public class EX11 {

	public static void main(String[] args) {
		// 예외 직접 만들기1
		ExceptionTest1 et1 = new ExceptionTest1();
		
		et1.printName("펭수");
		et1.printName("범이");

	}

}
