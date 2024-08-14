package Chapter8;

class AccessModifier2 {
	// private - 오로지 동일 class 내에서만 접근 가능 -> 그래서 아래의 다른 클래스에서는 사용 못하니깐 에러가 남. 
	// -> 해결 방법은 EX03 파일 확인
	//private String MethodTest_EX02(int x, int y) {
	String MethodTest_EX02(int x, int y) { //Default 접근 제한자
		if(x > y) {
			return x + "이 " + y + "보다 크다.";
		}else if(x < y) {
			return y + "이 " + x + "보다 크다.";
		}else {
			return x + "와 " + y + "는 같다.";
		}
	}
}

public class EX02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier2 am = new AccessModifier2();
		String str = am.MethodTest_EX02(100, 200);
		System.out.println("결과: " + str);
	}

}
