package Chapter3;
import java.util.Scanner;
public class Quiz2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자에게 출생년도 (EX:19881027) 8자리 입력받아 연/월/일 나누어 출력
		Scanner input = new Scanner(System.in);
		System.out.print("출생 년도 8자리 입력: ");
		int year = input.nextInt();
		int y = year / 10000;
		int m = year % 10000 / 100;
		int d = year % 100;
		System.out.print("년: "+ y + " 월: " + m + " 일: " + d);
		
		input.close();
	}
}
