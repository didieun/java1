package Chapter7;

// method(메소드)

//2. 마법 모자를 만들고 싶을때 (매개 변수) - 예) 1을 집어넣고 2가 나오는것
class MagicHat {
	public void MethodTest_EX03(int num) {
		num += 1;
		System.out.println(num);
	}
}

public class EX03 {

	public static void main(String[] args) {
		// 1. MagicHat 객체 생성
		MagicHat magicHat = new MagicHat();
		
		// 2. 메소드 호출(인자)
		// -> 1을 넣을경우 2가 나오게..( 메서드에 인자값을 +1이 되게끔 작성했기때문에 결과가 +1이됨)
		magicHat.MethodTest_EX03(1);
		
		magicHat.MethodTest_EX03(2);
		magicHat.MethodTest_EX03(3);
		magicHat.MethodTest_EX03(99);
		magicHat.MethodTest_EX03(1000);
		
	}

}
