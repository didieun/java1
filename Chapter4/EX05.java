package Chapter4;

import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {
		//   세 수를 입력받아 큰 수를 출력
		Scanner input = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("숫자 입력: ");
		num1 = input.nextInt();
		System.out.print("숫자 입력: ");
		num2 = input.nextInt();
		System.out.print("숫자 입력: ");
		num3 = input.nextInt();
		
		if(num1 >= num2 && num1 >= num3) {
			System.out.println(num1 + "이 큰 수 입니다.");
		} if(num2 >= num1 && num2 >= num3) {
			System.out.println(num2 + "이 큰 수 입니다.");
		} else {
			System.out.println(num3 + "이 큰 수 입니다.");
		}
		
		
		
		input.close();
		
		// 1, 2, 3 입력시 > OK
		// 1, 3, 2 입력시 > OK
		// 3, 1, 2 입력시 > Error
		// -> error 나는 이유, if ~ else 는 조건이 2개 일때만 써야되므로 답은 ex05_1 확인
		
	}

}
