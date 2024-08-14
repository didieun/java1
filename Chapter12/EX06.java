package Chapter12;

public class EX06 {

	public static void main(String[] args) {
		// 배열을 사용할때 에러
		int[] arr = {1, 2, 3};
		
		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i] + " ");
			//java.lang.ArrayIndexOutOfBoundsException 에러
		}
		

	}

}
