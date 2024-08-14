package Chapter10;

class Computer2 {
	String CPU = "Intel";
	String RAM = "Samsung";
	String SSD = "Samsung";
	
	Computer2(String setCPU) {
		CPU = setCPU;
		
		// 생성자는 초기화만 가능 (메서드랑 비슷하지만 생성자는 반환값이 존재하지 않음)
	}
	
	Computer2() {} 
}

public class EX02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 객체 생성 -> 에러남 해결 EX03 확인 
		Computer2 com = new Computer2();
		System.out.println("CPU: " + com.CPU);
		System.out.println("RAM: " + com.RAM);
		System.out.println("SSD: " + com.SSD);
		
	}

}
