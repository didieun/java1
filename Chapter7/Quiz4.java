package Chapter7;

import java.util.Scanner;

class Absolute {
	public int absoluteCheck(int num) {
		if (num < 0)
			return -num;
		else
			return num;
	}
	public void outPut(int num, int result) {
		System.out.println("입력값: " + num);
		System.out.println("절대값: " + result);
	}
}

public class Quiz4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Absolute ab = new Absolute();
		System.out.print("정수 입력: ");
		int num = input.nextInt();
		int result = ab.absoluteCheck(num);
		ab.outPut(num, result);
		input.close();
	}
}