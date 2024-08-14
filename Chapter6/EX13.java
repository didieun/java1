package Chapter6;

public class EX13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayInt8 = {10, 20, 30, 40, 50};
		
		//for 문
		for ( int i = 0; i < arrayInt8.length; i++) {
			System.out.println(arrayInt8[i]);
		}
		
		System.out.println();
		
		//for each 문
		for(int num : arrayInt8) {
			System.out.println(num);
		}
	}

}
