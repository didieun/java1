package Chapter8;

public class EX07 {

	public static void main(String[] args) {
		EX04 name = new EX04();
		EX05 age = new EX05();
		EX06 address = new EX06();
		
		System.out.println(name.MethodTest_EX04("박지은"));
		System.out.println(age.MethodTest_EX05(34));
		System.out.println(address.MethodTest_EX06("서울시 성동구 응봉동"));
		
		System.out.println();
		
		// 선생님 풀이
		name.p_name();
		age.p_age();
		address.p_address();
		
	}

}
