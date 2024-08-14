package Chapter12;

public class EX09 {

	public static void main(String[] args) {
		// 해결3
		int[] arr = {1, 2, 3};
		
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(arr[i] + " ");
				//java.lang.ArrayIndexOutOfBoundsException 에러
			}
		} catch (Exception e) {
			//에외 클래스 종류랑, 에외 메시지
			System.err.println(e);
		}
	}

}
