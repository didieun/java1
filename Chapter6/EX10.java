package Chapter6;

public class EX10 {

	public static void main(String[] args) {
		int[] arrayInt1 = new int[100];
		
		//1. 1 ~ 100까지 정수 값 담기 (for 문 사용)
		for(int i = 0; i < arrayInt1.length; i++) {
			arrayInt1[i] = i + 1;
		}

		//2. 1 ~ 100까지 정수 값 꺼내서 출력 (for 문 사용)
		for(int i = 0; i < arrayInt1.length; i++) {
			System.out.println(arrayInt1[i]);
		}
		
		System.out.println();
		
		//3. 1 ~ 100까지 정수 합 구하여 출력 (for 문 사용)
		int sum = 0;
		
		for(int i = 0; i < arrayInt1.length; i++) {
			sum += arrayInt1[i];
		}
		
		System.out.println("1 ~ 100 까지의 총 합은: " + sum);
	}

}
