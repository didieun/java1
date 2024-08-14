package Chapter3;
import java.util.Scanner;
public class Quiz1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자에게 아이디와 비밀번호 입력받아 회원 가입 진행하는 프로그램 구형
		Scanner input = new Scanner(System.in);
		String id,password;
		System.out.print("ID 입력: ");
		id = input.nextLine();
		System.out.print("PASSWORD 입력: ");
		password = input.nextLine();
		
		System.out.println();
		
		System.out.println("===== 회원 가입 완료 ===== ");
		System.out.println("ID : "+ id);
		System.out.println("PASSWORD : " + password);
		
		input.close();
	}
}