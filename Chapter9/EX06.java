package Chapter9;

class Varaible3 {
	static int var = 100; // 클래스변수
	public void veriable() {
		System.out.println("var: " + var);
	}
	public void func() {
		System.out.println("var: " + var);
	}
}

public class EX06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Varaible3.var = 300; // 인스턴스 변수는 객체 생성전에 쓰면 에러남 그래서 위에 class 에 int var 변수에 static 넣어서 씀.(클래스 변수로 변경)
		Varaible3 va = new Varaible3();
		va.veriable();
		va.func();

	}

}
