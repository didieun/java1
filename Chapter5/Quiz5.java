package Chapter5;

public class Quiz5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		
		while(i <= 55) {
			System.out.print("*  ");
			if(i % 11 == 0) {
				System.out.println();
			}
			i++;
		}
	}

}
