package Chapter3;

public class EX05 {

	public static void main(String[] args) {
		// 증감 연산자
		double su = 11.2;
		
		su++; System.out.println("su++: " + su); //su = su + 1
		++su; System.out.println("++su: " + su);
		su--; System.out.println("su--: " + su); //su = su - 1
		--su; System.out.println("--su: " + su);
		
		int data1, data2, data3;
		data1 = 10; data2 = ++data1; //먼저 +1되고 저장
		data1 = 10; data3 = data1++; // 저장하고 +1됨 그래서 data1 = 11이됨 하지만 data3 은 먼저 저장되었기때문에 10
		
		System.out.println("data2: " + data2);
		System.out.println("data3: " + data3);

	}

}
