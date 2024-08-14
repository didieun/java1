package Chapter9;

import java.util.Scanner;

// 공개 전용
class SetGet_03 {
	
	private String name;
	
	public void setName() { //getName에 private 을 public 변경
		Scanner input = new Scanner(System.in);
		
		System.out.print("이름: ");
		this.name = input.next();
		
		input.close();
	}
	
	public String getName() { //getName에 private 을 public 변경
		return this.name;
	}
	
}

public class EX09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetGet_03 sg = new SetGet_03();
		sg.setName();
		System.out.println("공개형: " + sg.getName());

	}

}

