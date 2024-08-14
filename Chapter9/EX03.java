package Chapter9;

class Varaible1 {
	public void veriable() {
		int var = 100; //블록 안에서만 사용가능 - 지역 변수 (다른 영역에서는 사용 안됨) -> 해결 방안 EX04 확인
		System.out.println("var: " + var);
	}
	public void func() {
//		System.out.println("var: " + var); // 에러남
	}
}

public class EX03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Varaible1 va = new Varaible1();
		va.veriable();
		va.func();

	}

}
