package Chapter3;

public class EX06 {

	public static void main(String[] args) {
		// 조건 연산자
		int data1 = 8;
		String s = (data1 % 2 == 0) ? "짝수" : "홀수";
		System.out.println(data1 + "=" + s);
		
		int data2 = 9;
		String t = (data2 % 2 == 0) ? "짝수" : "홀수";
		System.out.println(data2 + "=" + t);
				
	}

}
