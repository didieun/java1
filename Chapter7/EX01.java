package Chapter7;

// field(필드)

// 클래스명의 첫글자는 무조건 대문자로
class Car {
	String commpany = "제네시스";
	String model = "GV90";
	String color = "White";
	int maxSpeed = 200;
	int rpm;
	int currentSpeed;
	boolean enginStart;
}

public class EX01 {

	public static void main(String[] args) {
		// 객체 생성
		Car car = new Car();
		
		// 필드 데이터 출력 (필드에 접근 할때에는 도트(".")연산자를 사용)
		System.out.println("제조 회사: " + car.commpany);
		System.out.println("차 모델명: " + car.model);
		System.out.println("색상이름: " + car.color);
		System.out.println("최대 속도: " + car.maxSpeed);
		System.out.println("회전 속도: " + car.rpm);
		System.out.println("현재 속도: " + car.currentSpeed);
		System.out.println("시동 여부: " + car.enginStart);
		
		System.out.println();
		
		// 필드 값 변경
		car.rpm = 3000;
		car.currentSpeed = 77;
		car.enginStart = true;
		
		System.out.println("회전 속도: " + car.rpm);
		System.out.println("현재 속도: " + car.currentSpeed);
		System.out.println("시동 여부: " + car.enginStart);
		
	}

}
