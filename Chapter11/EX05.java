package Chapter11;

import java.util.Scanner;

//추상 클래스, 추상 메서드
abstract class Machine {
	Scanner input = new Scanner(System.in);
	protected String Owner;
	protected String Serial;
	protected Machine(String Owner, String Serial) {
		this.Owner = Owner;
		this.Serial = Serial;
	}
	
	// 추상 메서드는 무조건 사용해야됨! 안그러면 에러남
	public abstract void turnOn();
	public abstract void machineInfo();
	
}

class Monitor extends Machine {
	public Monitor(String Owner, String Serial) {
		super(Owner, Serial);
	}
	
	@Override
	public void turnOn() {
		System.out.println("모니터 전원 On");
	}
	
	@Override
	public void machineInfo() {
		System.out.println("관리자: " + this.Owner);
		System.out.println("관리번호: " + this.Serial);
		System.out.print("전원을 키시겠습니까(y/n)?");
		char flag = input.next().charAt(0);
		
		if(flag == 'y' || flag == 'Y') {
			turnOn();
		}
	}
}

class Com extends Machine {
	public Com(String Owner, String Serial) {
		super(Owner, Serial);
	}
	
	@Override
	public void turnOn() {
		System.out.println("컴퓨터 전원 On");
	}
	
	@Override
	public void machineInfo() {
		System.out.println("관리자: " + this.Owner);
		System.out.println("관리번호: " + this.Serial);
		System.out.print("전원을 키시겠습니까(y/n)?");
		char flag = input.next().charAt(0);
		
		if(flag == 'y' || flag == 'Y') {
			turnOn();
		}
	}
}

public class EX05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monitor mo = new Monitor("Admin_1", "1-100");
		mo.machineInfo();
		
		System.out.println();
		
		Com com = new Com("Admin_2", "2-200");
		com.machineInfo();
		

	}

}
