package Chapter9;

class Varaible4 {
	int var = 100; // 인스턴스 변수로 바꿔서 사용하면됨 
	public void veriable() {
		System.out.println("var: " + var);
	}
	public void func() {
		System.out.println("var: " + var);
	}
}

public class EX05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Varaible4.var = 300; // 인스턴스 변수는 객체 생성전에 쓰면 에러남 -> 해결 EX06확인
		Varaible4 va = new Varaible4();
		va.veriable();
		va.func();

	}

}
