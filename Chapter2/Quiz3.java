package Chapter2;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String name;
		int kor, eng, math;
		
		System.out.print("당신의 이름은 무엇입니까? ");
		name = input.nextLine();
		
		System.out.print(name + " 님의 국어 점수: ");
		kor = input.nextInt();
		
		System.out.print(name + " 님의 영어 점수: ");
		eng = input.nextInt();
		
		System.out.print(name + "님 의 수학 점수: ");
		math = input.nextInt();
		
		System.out.println();
		
		System.out.println("=====================================================");
		System.out.println("이 름 : " + name );
		System.out.println("국 어 : " + kor );
		System.out.println("영 어 : " + eng );
		System.out.println("수 학 : " + math );
		System.out.println("=====================================================");
		System.out.println("합 계 : " + (kor + eng + math));
		System.out.println("=====================================================");
		
		input.close();

	}

}
