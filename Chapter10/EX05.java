package Chapter10;

class Computer5 {
	String CPU = "Intel";
	String RAM = "Samsung";
	String SSD = "Samsung";
	
	Computer5(String CPU) {
		this.CPU = CPU;
	}
	
	Computer5() {}
}

public class EX05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 정리 -> 생성자를 사용하는 이유는 객체마다 다른 속성을 가질수있어서
		// 예) 붕어빵에서 팥이 들어가있는 붕어빵을 만들면 기존에는 클래스에서 팥만 무한대로 만들수 있는데 
		// 생성자를 만들면 팥, 슈크림, 피자등의 맛이 다양하게 만들수 있음.
		
		Computer5 com1 = new Computer5();
		System.out.println("CPU: " + com1.CPU);
		System.out.println("RAM: " + com1.RAM);
		System.out.println("SSD: " + com1.SSD);
		
		System.out.println();
		
		Computer5 com2 = new Computer5("AMD");
		System.out.println("CPU: " + com2.CPU);
		System.out.println("RAM: " + com2.RAM);
		System.out.println("SSD: " + com2.SSD);
		
		System.out.println();
		
		Computer5 com3 = new Computer5("Samsung");
		System.out.println("CPU: " + com3.CPU);
		System.out.println("RAM: " + com3.RAM);
		System.out.println("SSD: " + com3.SSD);
	
	}

}