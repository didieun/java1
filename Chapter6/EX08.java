package Chapter6;

public class EX08 {

	public static void main(String[] args) {
		// 배열 2번째 방식
		int[] arrayInt3 = new int[] {10, 20, 30};
		// 배열 3번째 방식
		int[] arrayInt4 = {40, 50, 60, 70};
		
		System.out.println(arrayInt3[0]);
		System.out.println(arrayInt3[1]);
		System.out.println(arrayInt3[2]);
		
		System.out.println(arrayInt4[0]);
		System.out.println(arrayInt4[1]);
		System.out.println(arrayInt4[2]);
		System.out.println(arrayInt4[3]);
 
		System.out.println(arrayInt3[0] + arrayInt4[1]);
		
		// 배열 4번째 방식
		int[] arrayInt5;
		arrayInt5 = new int[] {80, 90};
		System.out.println(arrayInt5[0]);
		System.out.println(arrayInt5[1]);
	}

}
