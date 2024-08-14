package Chapter6;

public class EX12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arrayInt7 = new int[3][]; // 이렇게 사용해도 문제가 없긴함 (대신 초기화 해줘야댐)
		// 배열 선언할때 참조변수만 입력했을경우 1차원 배열이 없어서 (
		//값을 지정할수 없어서 error 가 남
		// arrayInt7[0][0] = 10; -> error
		// java.lang.NullPointerException
		
		
		// 1차원 배열을 초기화시킴 -> 가변길이 변화 (1차원 배열 길이를 다 다르게 지정할수 있음)
		arrayInt7[0] = new int[1];
		arrayInt7[1] = new int[2];
		arrayInt7[2] = new int[3];
		
		arrayInt7[0][0] = 10;
		System.out.println(arrayInt7[0][0]);
	
	}

}
