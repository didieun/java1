package Chapter12;

public class EX07 {

	public static void main(String[] args) {
		// 배열을 사용할때 에러
		int[] arr = {1, 2, 3};

		// 해결 방법! (아래)
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(arr[i] + " ");
				//java.lang.ArrayIndexOutOfBoundsException 에러
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 발생!");
		} finally {
			System.out.println("finally은 무조건 실행되며 생략가능!");
		}
		
		//선생님 해결
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(arr[i] + " ");
				//java.lang.ArrayIndexOutOfBoundsException 에러
			}
		} catch (Exception e) {
			// 메시지 직접 작성
			System.out.println("인덱스 범위를 벗어났습니다.");
		}
	}

}
