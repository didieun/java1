package Chapter4;

import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {
		// 세 수를 입력받아 큰 수를 출력( if ~ else if ~ else 문)
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
		} else if(num2 >= num1 && num2 >= num3){
			System.out.println(num2 + "이 큰 수 입니다.");
		} else {
			System.out.println(num3 + "이 큰 수 입니다.");
		}
				
		input.close();

	}

}
