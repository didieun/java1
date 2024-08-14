package Chapter10;
import java.util.Scanner;

class UpDown {
	// 1.  Random값 저장, 시도 횟수 저장
	public int rand;
	public int score;
	// 2. Random값 발생
	public void randomMethod() {
		this.rand = (int)(Math.random()*99+1);
	}
	// 3. 이전 기록 확인
	public int scoreCheck(int score) {
		this.score = score;
		return this.score;
	}
}

public class Quiz7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		UpDown ud = new UpDown();
		int choice, user, scoreCount = 0, scoreResult = 0;
		while (true) {
			System.out.println("===== UP & DOWN GAME =====");
			System.out.println("1. 게임 시작");
			System.out.println("2. 기록 확인");
			System.out.println("3. 게임 종료");
			System.out.print("번호를 선택하세요: ");
			choice = input.nextInt();
			switch (choice) {
				case 1:
					System.out.println("===== Game Start =====");
					ud.randomMethod();
					System.out.println(ud.rand);
					
					while (true) {
						System.out.print("정답 입력: ");
						user = input.nextInt();
						if (ud.rand > user) {
							System.out.println("UP!");
							scoreCount++;
						} else if (ud.rand < user) {
							System.out.println("DOWN!");
							scoreCount++;
						} else {
							System.out.println("GOOD!");
							scoreCount++;
							System.out.println("\n정답을 입력하셨습니다.>");
							System.out.println("< 정답 입력 횟수: " + scoreCount + "회 입니다.>");
							scoreResult = ud.scoreCheck(scoreCount);
							break;
						}
					}
					break;
					
				case 2:
					System.out.println("이전 기록은 " + scoreResult + "점 입니다.");
					break;
					
				case 3:
					System.out.println("게임을 종료 합니다.");
					input.close();
					System.exit(0);
					break;
			} // switch
			
		} // while
	
	}
}
