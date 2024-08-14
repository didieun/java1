package Chapter11;

//상속

// 계산기 기능 class
class MyCalc {
	public void calcMethod(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("합: " + sum);
	}
}

// 상속 받아야됨 -> 부모 클래스 작성 extends 부모 클래스명 -> (extends Mycalc 추가) 
class Computer extends MyCalc {
	public void phoneMethod(int num1, int num2) {
		System.out.println("컴퓨터 계산기 실행");
		calcMethod(num1, num2);
	}
}

//상속 받아야됨 -> 부모 클래스 작성 extends 부모 클래스명 -> (extends Mycalc 추가) 
class HandPhone extends MyCalc {
	public void phoneMethod(int num1, int num2) {
		System.out.println("핸드폰 계산기 실행");
		calcMethod(num1, num2);
	}
}

public class EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer com = new Computer();
		com.calcMethod(100, 200);
		
		HandPhone phone = new HandPhone();
		phone.calcMethod(200, 300);
	}

}
