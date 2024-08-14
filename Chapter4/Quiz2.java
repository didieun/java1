package Chapter4;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력: ");
		int num1 = input.nextInt();
		
		System.out.print("두 번째 정수 입력: ");
		int num2 = input.nextInt();
		
		int max = 0, min = 0;
		if (num1 > num2) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		}
		System.out.println("큰 값: " + max + "작은 값: " + min);
		
//		if (num1 > num2) {
//			System.out.println("큰 값: " + num1 + " 작은 값: " + num2);
//		} else {
//			System.out.println("큰 값: " + num2 + " 작은 값: " + num1);
//		}
		
		input.close();

	}

}
