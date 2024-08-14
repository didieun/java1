package Chapter5;

public class EX05 {

	public static void main(String[] args) {
		// for 문과 조건문을 이용하여 아래와 같이 출력 하시오.
		// (hint: 다섯번 출력하고 줄 바꿈이 이루어져야 하므로, 5의 배수 마다 출 바꿈 처리하도록 조건을 설정)
		for(int i = 1; i <= 25; i++) {
			if(i % 5 == 0) {
				System.out.print(i + "\t");
				System.out.println();
			} else {
				System.out.print(i + "\t");
			}
		}
		
		System.out.println();
		
		//선생님 풀이 (for + if)
		for(int i = 1; i <= 25; i++) {
			System.out.print(i + "\t");
			if(i % 5 == 0) {
				System.out.println();
			}
		}
		
		System.out.println();
		
		// 선생님 풀이 (for + if ~ else)
		for(int i = 1; i <= 25; i++) {
			if(i % 5 == 0) {
				System.out.println(i + "\t");
			} else {
				System.out.print(i + "\t");
			}
		}
	}

}
