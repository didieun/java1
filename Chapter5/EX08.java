package Chapter5;

public class EX08 {

	public static void main(String[] args) {
		// 1 ~ 10까지 짝수, 홀수 합을 while 문을 사용하여 구하여라.
			
		int i = 1;
		int sum1 = 0;
		int sum2 = 0;
		
		while(i <= 10) {
			if(i % 2 == 0) {
				sum1 += i;
			} else {
				sum2 += i;
			}
			i++;
		}
		
		System.out.println("1 ~ 10 까지 짝수의 합: " + sum1);
		System.out.println("1 ~ 10 까지 홀수의 합: " + sum2);
		
		System.out.println();
		
		// 선생님 풀이
		
		int j = 1;
		int evenSum = 0, oddSum = 0;
		
		while(j < 11) {
			if(j % 2 == 0) {
				evenSum += j;
			} else {
				oddSum += j;
			}
		
			j++;
		}
		
		System.out.println("짝수 합: " + evenSum + " 홀수 합: " + oddSum);
	}

}
