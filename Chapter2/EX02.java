package Chapter2;

public class EX02 {

	public static void main(String[] args) {
		// 자료형 변환
		int s1 = 10; // 4byte
		// promotion 은 자동으로 형변함됨
		long s2 = s1; //8byte
		short s3; //2byte
		
		//Casting 은 형변환이 필요함
		s3 = (short)s1;

		System.out.println(s2);
		System.out.println(s3);
	}

}
