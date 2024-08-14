package Chapter9;

import java.util.Scanner;

//비공개형
class SetGet_01 {
	
	private String name;
	
	private void setName() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("이름: ");
		this.name = input.next();
		
		input.close();
	}
	
	private String getName() {
		return this.name;
	}
	
	public void nameSetGet() {
		setName();
		System.out.println("이름 출력: " + getName());
	}
}

public class EX07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetGet_01 sg = new SetGet_01();
		
		sg.nameSetGet();

	}

}
