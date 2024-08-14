package Chapter5;

public class EX06 {

	public static void main(String[] args) {
		// 중첩 for 문 또는 이중 for 문
		
		for(int i = 0; i < 3; i++) {
			System.out.println("첫번째 For문");
			for(int a = 0; a < 2; a++ ) {
				System.out.println("두번째 For문");
			}
		}
		
		System.out.println();
		
		//선생님 풀이
		for(int i = 1; i < 4; i++) {
			System.out.println("첫 번째 for문!");
			for(int j = 1; j < 3; j++ ) {
				System.out.println("두 번째 for문!");
			}
		}
	}
}
