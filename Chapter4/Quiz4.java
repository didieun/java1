package Chapter4;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("수 입력: ");
		int year = input.nextInt();
		
		if (year % 400 == 0) {
			System.out.println(year + "년도는 윤년 입니다.");
		} else if (year % 100 == 0) {
			System.out.println(year + "년도는 평년 입니다.");
		} else if (year % 4 == 0) {
			System.out.println(year + "년도는 윤년 입니다.");
		} else {
			System.out.println(year + "년도는 평년 입니다.");
		}
		
		input.close();
		
	}

}
