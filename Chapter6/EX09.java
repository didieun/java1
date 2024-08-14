package Chapter6;

public class EX09 {

	public static void main(String[] args) {
		// 인덱스 출력(정수 배열)
		int[] arrayInt1 = new int[10];
		
		for (int i = 0; i < arrayInt1.length; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		// 값 출력(정수 배열)
		int[] arrayInt2 = {1, 3, 5, 7, 9};
		for (int i = 0; i < arrayInt2.length; i++) {
			System.out.println(arrayInt2[i]);
		}
		
		System.out.println();
		
		// 인덱스 출력(문자열 배열)
		String[] arrayStr1 = new String[10];
		for(int i = 0; i < arrayStr1.length; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		// 값 출력(문자열 배열)
		String[] arrayStr2 = {"A", "B", "C"};
		for (int i = 0; i < arrayStr2.length; i++) {
			System.out.println(arrayStr2[i]);
		}
	}

}
