package Chapter4;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		int num = input.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num + "은 짝수 입니다.");
		} else {
			System.out.println(num + "은 홀수 입니다.");
		}
		input.close();
	}

}
