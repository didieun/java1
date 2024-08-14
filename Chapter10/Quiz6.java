package Chapter10;
import java.util.Scanner;
class Prime {
public int primeCheck(int num) {
	int cnt = 0;
	for (int i = 1; i <= num; i++) {
		if (num % i == 0)
			cnt++;
	}
	return cnt;
}
public void outPut(int num, int cnt) {
	if (cnt == 2) {
		System.out.println(num + "은(는) 소수 입니다.");
	} else {
		System.out.println(num + "은(는) 소수가 아닙니다.");
		}
	}
}
public class Quiz6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Prime prime = new Prime();
		System.out.print("정수 입력: ");
		int num = input.nextInt();
		input.close();
		int cnt = prime.primeCheck(num);
		prime.outPut(num, cnt);		
	}
}
