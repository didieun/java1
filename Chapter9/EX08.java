package Chapter9;

import java.util.Scanner;

// 읽기전용
class SetGet_02 {
	
	private String name;
	
	private void setName() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("이름: ");
		this.name = input.next();
		
		input.close();
	}
	
	public String getName() { //getName에 private 을 public 변경하면 읽기전용으로 됨
		return this.name;
	}
	
	public void nameSetGet() {
		setName();
		System.out.println("이름 출력: " + getName());
	}
}

public class EX08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetGet_02 sg = new SetGet_02();
		sg.nameSetGet();
		
		System.out.println("읽기 전용: " + sg.getName());

	}

}