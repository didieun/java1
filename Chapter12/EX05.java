package Chapter12;

public class EX05 {

	public static void main(String[] args) {
		// 실행 예외 (해결)
		try {
			String str = null;
			System.out.println(str.charAt(0));
		} catch (NullPointerException e) {
			System.out.println("NullPointerException 발생!");
		} finally {
			System.out.println("무조건 실행되며 생략가능!");
		}

	}

}
