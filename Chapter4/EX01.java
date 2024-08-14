package Chapter4;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("숫자를 입력: ");
		int num = input.nextInt();
		
		if(num == 1) {
			System.out.println("1입니다.");
		}
		
		input.close();

	}

}
