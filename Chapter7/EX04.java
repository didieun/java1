package Chapter7;

//3. 긴코드 축약 + 마법 모자를 만들고 싶을때(매개 변수)
class Hi2 {
	public void MethodTest_EX04(String name) {
		System.out.println(name + "님 안녕하세요.");
		System.out.println(name + "님 반갑습니다.");
		System.out.println(name + "님 또만나요.");
	}
}

public class EX04 {

	public static void main(String[] args) {
		// 1. hi2 객체 생성
		Hi2 hi2 = new Hi2();
		
		//2. 메소드 호출
		hi2.MethodTest_EX04("장원영");
		hi2.MethodTest_EX04("김석진");
		hi2.MethodTest_EX04("변우석");
	}

}
