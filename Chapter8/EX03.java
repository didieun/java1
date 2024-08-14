package Chapter8;

class AccessModifier3 {
	// private - 오로지 동일 class 내에서만 접근 가능 -> 그래서 아래의 다른 클래스에서는 사용 못하니깐 에러가 남.
	// -> 해결방법 -> 아래에 public 메서드를 만들어서 리턴 해줌.(반드시 public 으로 만들어야됨)
	private String MethodTest_EX03(int x, int y) {
		if(x > y) {
			return x + "이 " + y + "보다 크다.";
		}else if(x < y) {
			return y + "이 " + x + "보다 크다.";
		}else {
			return x + "와 " + y + "는 같다.";
		}
	}
	public String subMethodTest_EX03(int x, int y) {
		String str = MethodTest_EX03(100, 200);
		return str;
	}
}

public class EX03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier3 am = new AccessModifier3();
		String str = am.subMethodTest_EX03(100, 200);
		System.out.println("결과: " + str);
	}

}
