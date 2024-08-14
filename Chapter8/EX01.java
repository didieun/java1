package Chapter8;

class AccessModifier1 {
	//public  접근 제한자
	public String MethodTest_EX01(int x, int y) {
		if(x > y) {
			return x + "이 " + y + "보다 크다.";
		}else if(x < y) {
			return y + "이 " + x + "보다 크다.";
		}else {
			return x + "와 " + y + "는 같다.";
		}
	}
}

public class EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier1 am = new AccessModifier1();
		
		String str = am.MethodTest_EX01(100, 200);
		
		System.out.println("결과: " + str);
	}

}
