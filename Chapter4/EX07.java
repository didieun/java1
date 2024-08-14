package Chapter4;

import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {
		// Switch - case - default 문 기본구조( 간단한 data 식이면 switch 문으로 예를들어 0, 1 , 2 이런식의 데이터일 경우 )
		Scanner input = new Scanner(System.in);
		
		System.out.print("수 입력: ");
		int num = input.nextInt();
		
		switch(num % 2) {
			case 0 : System.out.println(num + "은 짝수 입니다."); break;
			default: System.out.println(num + "은 홀수 입니다."); break;
		}
		
		input.close();
		
	}

}
