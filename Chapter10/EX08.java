package Chapter10;

class Computer8 {
	String CPU;
	String RAM;
	String SSD;
	
	// 나머지 생성자는 반드시 첫줄에서만 사용한다! this 는 생성자를 다른 호출하는거다.
	Computer8() {
		this("Intel", "Samsung", "Samsung");
	}
	
	Computer8(String CPU) {
		this(CPU, "Samsung", "Samsung");
	}
	
	Computer8(String CPU, String RAM) {
		this(CPU, RAM, "Samsung");
	}
	
	// 중요!! 무조건 초기화 할 생성자가 있어야됨(한 생성자에 집중적으로 작정!)
	Computer8(String CPU, String RAM, String SSD) {
		this.CPU = CPU;
		this.RAM = RAM;
		this.SSD = SSD;
	}
}

public class EX08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer8 com1 = new Computer8();
		Computer8 com2 = new Computer8("AMD");
		Computer8 com3 = new Computer8("AMD", "SK");
		
		System.out.println("Com1 CPU: " + com1.CPU);
		System.out.println("Com1 RAM: " + com1.RAM);
		System.out.println("Com1 SSD: " + com1.SSD);
		
		System.out.println();
		
		System.out.println("Com2 CPU: " + com2.CPU);
		System.out.println("Com2 RAM: " + com2.RAM);
		System.out.println("Com2 SSD: " + com2.SSD);
		
		System.out.println();
		
		System.out.println("Com3 CPU: " + com3.CPU);
		System.out.println("Com3 RAM: " + com3.RAM);
		System.out.println("Com3 SSD: " + com3.SSD);

	}

}
