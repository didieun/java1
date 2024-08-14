package Chapter7;

// 6. 지역변수 - 블록 내에서만 사용
class MethodLocalVariable {
	public void MethodTestEX07_01() {
		int a = 10, b = 20;
		MethodTestEX07_02(a,b);
		System.out.println("EX07_01 => a : " + a);
		System.out.println("EX07_01 => b : " + b);
	}
	public void MethodTestEX07_02(int a, int b) {
		a += 100; b += 200;
		System.out.println("EX07_02 => a : " + a);
		System.out.println("EX07_02 => b : " + b);
	}
}

public class EX07 {

	public static void main(String[] args) {
		// 1. localVal 객체 생성
		MethodLocalVariable localVal = new MethodLocalVariable();
		
		// 2. MethodTest_EX01_01()호출
		localVal.MethodTestEX07_01();
		
		// 3. 결화 확인
	}

}
