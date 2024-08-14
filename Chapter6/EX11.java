package Chapter6;

public class EX11 {

	public static void main(String[] args) {
		// 2차원 배열
		int[][] arrayInt6 = new int[3][4];
		
		// 2차원 배열은 [][] 참조변수, 인덱스 다 입력해야됨.
		//arrayInt6[0] = 10; -> error
		//Type mismatch: cannot convert from int to int[]
		
		arrayInt6[0][0] = 10;
		System.out.println(arrayInt6[0][0]);
	}

}
