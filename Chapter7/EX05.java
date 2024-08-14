package Chapter7;

// 4. print 사용
class Test1 {
	public void MethodTest_EX05_01() {
		System.out.println(10);
	}
	public void MethodTest_EX05_02() {
		System.out.println(20);
	}
}

public class EX05 {

	public static void main(String[] args) {
		// 객체 생성
		Test1 test1 = new Test1();
		
		// 메소드 호출
		test1.MethodTest_EX05_01();
		test1.MethodTest_EX05_02();
		
		//System.out.println(test1.MethodTest_EX05_01() + test1.MethodTest_EX05_02());
		// The operator + is undefined for the argument type(s) void, void 
		// 위와 같이 에러남 -> test1의 메소드에 void 은  비어있다는거임, 해결 방법은 EX06 확인바람
		
	}

}
