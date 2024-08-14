package Chapter6;

public class EX07 {

	public static void main(String[] args) {
		// 배열 1번째 방식
		int[] arrayInt1 = new int[10];
		// 기본 정수는 저장값이 0, 실수는 0.0, 참조타입은 null 값으로 저장
		// 예) 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 -> 정수 타입 
		// 예) 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 -> 실수 타입 
		// 예) null, null, null, null, null, null, null, null, null, null -> 참조 타입 
		
		//초기화
		arrayInt1[0] = 1;
		arrayInt1[9] = 10;
		
		//출력
		System.out.println(arrayInt1[0]);
		System.out.println(arrayInt1[9]);
		
		System.out.println(arrayInt1[7]);
		
		int[] arrayInt2 = new int[3];
		
		System.out.println(arrayInt2[0]);
		System.out.println(arrayInt2[1]);
		System.out.println(arrayInt2[2]);
		
//		System.out.println(arrayInt2[3]);
		// java.lang.ArrayIndexOutOfBoundsException:
		// Index 3 out of bounds for length 3
		// 위의 오류는 잘못된 인덱스 배열에 접근할때 나오는 에러 메시지! 많이 나올듯..
	}

}
