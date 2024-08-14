package Chapter4;

import java.util.Scanner;

public class EX05_1 {

	public static void main(String[] args) {
		// 세수 입력받고 큰수 출력
		Scanner input = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("숫자 입력: ");
		num1 = input.nextInt();
		System.out.print("숫자 입력: ");
		num2 = input.nextInt();
		System.out.print("숫자 입력: ");
		num3 = input.nextInt();
		
		//해결1
		if(num1 >= num2 && num1 >= num3) {
			System.out.println(num1 + "이 큰 수 입니다.");
		} if(num2 >= num1 && num2 >= num3) {
			System.out.println(num2 + "이 큰 수 입니다.");
		} if (num3 >= num1 && num3 >= num2) {
			System.out.println(num3 + "이 큰 수 입니다.");
		}
		
		//해결2 (별로 좋지 않은 코드)
		if(num1 >= num2 && num1 >= num3) {
			System.out.println(num1 + "이 큰 수 입니다.");
		} else {
			if(num2 >= num1 && num2 >= num3) {
				System.out.println(num2 + "이 큰 수 입니다.");
			} else {
				System.out.println(num3 + "이 큰 수 입니다.");
			}
		}
		
		//해결3
		if(num1 >= num2 && num1 >= num3) {
			System.out.println(num1 + "이 큰 수 입니다.");
		} else if(num2 >= num1 && num2 >= num3){
			System.out.println(num2 + "이 큰 수 입니다.");
		} else {
			System.out.println(num3 + "이 큰 수 입니다.");
		}
				
		input.close();
		
		// 1, 2, 3 입력시 > OK
		// 1, 3, 2 입력시 > OK
		// 3, 1, 2 입력시 > OK
	}

}
