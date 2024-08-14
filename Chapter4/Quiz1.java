package Chapter4;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("날짜 입력: ");
		int day = input.nextInt();
		
		if (day % 7 == 1) {
			System.out.println(day + "일은 월요일 입니다.");
		} else if (day % 7 == 2) {
			System.out.println(day + "일은 화요일 입니다.");
		} else if (day % 7 == 3) {
			System.out.println(day + "일은 수요일 입니다.");
		} else if (day % 7 == 4) {
			System.out.println(day + "일은 목요일 입니다.");
		} else if (day % 7 == 5) {
			System.out.println(day + "일은 금요일 입니다.");
		} else if (day % 7 == 6) {
			System.out.println(day + "일은 토요일 입니다.");
		} else {
			System.out.println(day + "일은 일요일 입니다.");
		}
		
		input.close();
		
	}

}
