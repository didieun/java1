package Chapter6;

public class EX05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("javaProgramming");
		
		System.out.println(str.length());
		System.out.println(str.charAt(4));
		
		String addStr;
		addStr = "A";
		System.out.println(addStr);
		addStr += "B";
		System.out.println(addStr);
		
		System.out.println(str.charAt(0) == 'J');
		System.out.println(str.charAt(0) == 'j');
		
		System.out.println(str.charAt(1) - 32);
		System.out.println((char)(str.charAt(1) - 32));
	}

}
