package Chapter9;

class Varaible2 {
	int var = 100; // 인스턴스 변수로 바꿔서 사용하면됨 
	public void veriable() {
		System.out.println("var: " + var);
	}
	public void func() {
		System.out.println("var: " + var);
	}
}

public class EX04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Varaible2 va = new Varaible2();
		va.veriable();
		va.func();

	}

}
