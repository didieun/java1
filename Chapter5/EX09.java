package Chapter5;

import java.util.Scanner;

public class EX09 {

	public static void main(String[] args) {
		// 1 - 10까지 정수 입력 시 반복 종료 그외 정수 입력 시 다시 입력
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("10보다 작은 정수 입력: ");
			int num = input.nextInt();

			if(num <= 10) {
				System.out.println(num + "은(는) 11보다 작습니다.");
				break;
			} else {
				System.out.println("다시 입력해주세요!");
				continue;
			}
		}
		
		input.close();
	}

}
