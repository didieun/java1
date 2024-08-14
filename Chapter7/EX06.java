package Chapter7;

// 5. return 사용
class Test2 {
	// return 을 사용하여 값을 반환시켜줘야된다.
	public int MethodTest_EX06_01() {
		return 10;
	}
	public int MethodTest_EX06_02() {
		return 20;
	}
}
public class EX06 {

	public static void main(String[] args) {
		// 객체 생성
		Test2 test2 = new Test2();
		
		// 메소드 호출
		System.out.println(test2.MethodTest_EX06_01());
		System.out.println(test2.MethodTest_EX06_02());
		
		System.out.println(test2.MethodTest_EX06_01() + test2.MethodTest_EX06_02());
		// test2 메소드에 int 타입 이라는 값이 반환됐기 때문에 + 을 사용할수가 있음
		
	}

}
