package Chapter3;

public class EX02 {

	public static void main(String[] args) {
		// 대입 & 복합 대입 연산자
		int data1, data2;
		data1 = data2 = 5;
		System.out.println("data1 + 1 = " + (data1 += 1)); //data1 = data1 + 1
		System.out.println("data1 - 1 = " + (data1 -= 1)); //data1 = data1 - 1
		
		System.out.println("data1 * data2 = " + (data1 *= data2));
		System.out.println("data1 / data2 = " + (data1 /= data2));
		System.out.println("data1 % data2 = " + (data1 %= data2));
		
	}

}
