package Chapter5;

public class EX07 {

	public static void main(String[] args) {
		// 1 ~ 10까지 짝수, 홀수 합을 for 문을 사용하여 구하여라.
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				sum1 += i;
			} else {
				sum2 += i;
			}
		}
		
		System.out.println("1 ~ 10 까지 짝수의 합: " + sum1);
		System.out.println("1 ~ 10 까지 홀수의 합: " + sum2);
		
		System.out.println();
		
		// 선생님 풀이
		
		int evenSum = 0, oddSum = 0;
		
		for(int i = 1; i < 11; i++) {
			if(i % 2 == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
		}
		
		System.out.println("짝수 합: " + evenSum + " 홀수 합: " + oddSum);
	}

}
