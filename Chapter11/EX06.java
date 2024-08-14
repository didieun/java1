package Chapter11;

// Up-Casting - 자식클래스 타입을 부모클래스 타입으로 반환 (자동타입 변환)


class Upcasting_p {
	public String name;
	Upcasting_p(String name) {
		this.name = name;
	}
	public void getClassName() {
		System.out.println(name);
		System.out.println("Upcasting_p Test");
	}
}

class Upcasting_C1 extends Upcasting_p {
	Upcasting_C1(String name) {
		super(name);
	}
	
	@Override
	public void getClassName() {
		System.out.println(name);
		System.out.println("Upcasting_C1 Test");
	}
}

class Upcasting_C2 extends Upcasting_p {
	Upcasting_C2(String name) {
		super(name);
	}
	
	@Override
	// 오버라이딩을 하면 자식 클래스 에 접근 가능
	public void getClassName() {
		System.out.println(name);
		System.out.println("Upcasting_C2 Test");
	}
	public void Child_No2() {
		System.out.println("Child_No2_Method!");
	}
}

public class EX06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Upcasting_p upcasting = new Upcasting_p("Parents");
		upcasting.getClassName();
		
		upcasting = new Upcasting_C1("Child_No1"); // up-casting ( 부모클래스에 자식 클래스 객체 생성)
		upcasting.getClassName(); //그러므로 자식클래스의 Override 를 해서 자식클래스에 메서드를 접근가능하게 만듬! 
		
		upcasting = new Upcasting_C2("Child_No2"); // up-casting
		upcasting.getClassName();
//		upcasting.Child_No2(); // up-casting는 부모클래스에 메서드만 접근이 가능하기때문에 자식 메서드에 있는 Child_No2는 접근이 불가능!
	}

}
