package Chapter10;

class Computer3 {
	String CPU = "Intel";
	String RAM = "Samsung";
	String SSD = "Samsung";
	
	Computer3(String setCPU) {
		CPU = setCPU;
	}
	
	Computer3() {}
}

public class EX03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer3 com = new Computer3();
		System.out.println("CPU: " + com.CPU);
		System.out.println("RAM: " + com.RAM);
		System.out.println("SSD: " + com.SSD);
	}

}