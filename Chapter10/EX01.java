package Chapter10;

class Computer1 {
	String CPU = "Intel";
	String RAM = "Samsung";
	String SSD = "Samsung";
	
	Computer1() {} //기본 생성자 추가( 써도 되고 안써도 됨 )
}

public class EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 객체 생성 ( new 뒤에 있는게 생성자! 생성자는 class name 과 동일) 객체를 초기화!
		Computer1 com = new Computer1();
		System.out.println("CPU: " + com.CPU);
		System.out.println("RAM: " + com.RAM);
		System.out.println("SSD: " + com.SSD);
		
	}

}
