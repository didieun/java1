package Chapter2;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String id = "TEST1234";
		int password = 991005;
		
		System.out.println("ID : " + id);
		System.out.println("password : " + password);
		
		System.out.println();
		
		int noodle = 5000;
		int rice = 6000;
		int noodleTotal = noodle * 3;
		int riceTotal = rice * 2;
		int coupon = 3000;
		int sum = noodleTotal + riceTotal;
		int total = sum - coupon;
		
		System.out.println("짜장면: " + noodleTotal);
		System.out.println("볶음밥: " + riceTotal);
		System.out.println("합계: " + sum);
		System.out.println("최종금액: " + total);
		
		
	}

}
