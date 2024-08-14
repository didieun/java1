package Chapter10;

class Computer7 {
	String CPU;
	String RAM;
	String SSD;
	
	Computer7() {
		this.CPU = "Intel";
		this.RAM = "Samsung";
		this.SSD = "Samsung";
	}
	
	Computer7(String CPU) {
		this.CPU = CPU;
		this.RAM = "Samsung";
		this.SSD = "Samsung";
	}
	
	Computer7(String CPU, String RAM) {
		this.CPU = CPU;
		this.RAM = RAM;
		this.SSD = "Samsung";
	}
	
	Computer7(String CPU, String RAM, String SSD) {
		this.CPU = CPU;
		this.RAM = RAM;
		this.SSD = SSD;
	}
}

public class EX07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer7 com1 = new Computer7();
		Computer7 com2 = new Computer7("AMD");
		Computer7 com3 = new Computer7("AMD", "SK");
		
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
