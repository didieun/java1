package Chapter5;

public class EX10 {

	public static void main(String[] args) {
		// do - while(무조건 do -> 한번은 실행되어야한다.)
		int num = 0, numSum = 0;
		do {
			num++;
			numSum += num;
			
		} while (num <= -1);
		
		System.out.println("do - while numSum: " + numSum);
		
		// while
		num = 0; numSum = 0;
		while (num <= -1) {
			num++;
			numSum += num;
		}
		
		System.out.println("while numSum: " + numSum);
		
	}

}
