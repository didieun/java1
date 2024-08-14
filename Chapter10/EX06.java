package Chapter10;

class Computer6 {
	String CPU = "Intel";
	String RAM = "Samsung";
	String SSD = "Samsung";

	Computer6() {}
	
	Computer6(String CPU) {
		this.CPU = CPU;
	}
	
	Computer6(String CPU, String RAM) {
		this.CPU = CPU;
		this.RAM = RAM;
	}

}

public class EX06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer6 com1 = new Computer6();
		Computer6 com2 = new Computer6("AMD");
		Computer6 com3 = new Computer6("AMD", "SK");
		
	}

}