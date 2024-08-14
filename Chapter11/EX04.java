package Chapter11;

// 정보처리기사 시험에 많이 나온문제

import java.util.Scanner;

// 오버라이딩

// **상속되지 말아야 되는 class 는 final 을 class 앞에 써주면 상속 될수가 없다!
//final class A {
class A { //에러 해결
	protected String str;
	public A(String str) {
		this.str = str;
	}
	
	// **상속되지 말아야 되는 Method 는 final 을 중간에 넣어주면 됨!
//	public final void Method1() {
	public void Method1() { //에러 해결
		System.out.println("Parents Class!");
	}
}

class B extends A {
	public B(String str) {
		super(str);
	}
	
	@Override
	public void Method1() {
		if(super.str.equals("Parents")) {
			super.Method1();
		}else {
			System.out.println("Child Class!");
		}
	}
}

public class EX04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Parents or Child input: ");
		String str = input.next();
		B test = new B(str);
		test.Method1();
		input.close();
	}

}
