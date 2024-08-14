package Chapter11;

//up-casting 다형성 - 다형성이란 하나의 객체가 여러가지 타입을 가질 수 있는 것입니다.
// 부모 클래스의 참조변수로 자식 클래스의 인스턴스를 참조하는 방식으로 많이 사용합니다.

abstract class HyperCar {
	public abstract void HyperCarRun();
}

class Bugatti extends HyperCar {
	@Override
	public void HyperCarRun() {
		System.out.println("SuperCar Bugatti Run!");
	}
}

class Laferrari extends HyperCar {
	@Override
	public void HyperCarRun() {
		System.out.println("SuperCar Laferrari Run!");
	}
}

class Benz extends HyperCar {
	@Override
	public void HyperCarRun() {
		System.out.println("SuperCar Benz Run!");
	}
}

class Driver {
	// HyperCar hyperCar -> 부모클래스를 매개변수로 쓸수 있음 ! (ex: 부모클래스명 변수명 = new Bugatti();)
	public void drive(HyperCar hyperCar) {
		hyperCar.HyperCarRun();
	}
}

public class EX07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver drive = new Driver();
		drive.drive(new Bugatti()); // drive 객체에 인자값에 자식 클래스가 들어감
		drive.drive(new Laferrari()); // drive 객체에 인자값에 자식 클래스가 들어감
		
		drive.drive(new Benz());
	}

}
