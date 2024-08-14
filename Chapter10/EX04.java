package Chapter10;

class Computer4 {
	String CPU = "Intel";
	String RAM = "Samsung";
	String SSD = "Samsung";
	
	Computer4(String CPU) {
		CPU = CPU; // 매개변수랑 , 필드의 이름을 동일하게 하면 매개변수가 필드보다 우선이여서 CPU가 매개변수라고 인식함... 해결방법은 EX05확인
	}
	
	Computer4() {}
}

public class EX04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer4 com = new Computer4("AMD");
		System.out.println("CPU: " + com.CPU);
		System.out.println("RAM: " + com.RAM);
		System.out.println("SSD: " + com.SSD);
	}

}