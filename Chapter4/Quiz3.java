package Chapter4;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("국어 점수 입력: ");
		int kor = input.nextInt();
		
		System.out.print("영어 점수 입력: ");
		int en = input.nextInt();
		
		System.out.print("수학 점수 입력: ");
		int math = input.nextInt();
		
		if ((kor + en + math) / 3 < 70) {
			System.out.println("불합격(평균 점수 미달)");
		} else if (kor < 60) {
			System.out.println("불합격(국어 점수 미달)");
		} else if (en < 60) {
			System.out.println("불합격(영어 점수 미달)");
		} else if (math < 60) {
			System.out.println("불합격(수학 점수 미달)");
		} else {
			System.out.println("합격!");
		}

		input.close();
		
	}

}
