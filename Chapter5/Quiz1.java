package Chapter5;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long save = 0, money = 10;
		int day = 1;
		
		for (day = 1; day <= 30; day++) {
			save += money;
			money *= 2;
		}
		--day;
		System.out.println(day + "일 저축액: " + save);
		
	}

}
