package Chapter12;

public class EX03 {

	public static void main(String[] args) {
		// 일반예외 - 코드 실행전에 체크되는 에러 (해결)
		try {
			Class test = Class.forName("Animal");
		} catch(Exception e) { // 에러종류를 모를땐 Exception e 사용
			System.out.println("예외 발생!");
		}
	}

}
