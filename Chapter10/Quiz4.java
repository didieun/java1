package Chapter10;
import java.util.Scanner;
class EvenOdd {
	String checkEvenOdd(int num) {
		if (num % 2 == 0) {
			return num + "은 짝수";
		} else {
			return num + "은 홀수";
		}
	}
}
public class Quiz4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		EvenOdd eo = new EvenOdd();
		
		System.out.print("수 입력: ");
		int number = input.nextInt();
		
		String result = eo.checkEvenOdd(number);
		
		System.out.println("결과: " + result);
		input.close();
	}
}