package Chapter3;
import java.util.Scanner;
public class Quiz3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자에게 출생년도(EX:19881027) 8자리를 입력받아 나이를 계산하여 출력
		Scanner input = new Scanner(System.in);
		System.out.print("출생 년도 8자리 입력: ");
		int year = input.nextInt();
		int y = year / 10000;
		int age = 2024 - y + 1;
		System.out.println("나이 : "+ age);
		
		input.close();
	}
}
