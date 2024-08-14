package Chapter6;

public class EX14 {

	public static void main(String[] args) {
		// 배열 복사(방법1)
		int[] oldArrayInt = {1,2,3};
		//복사할 기존 배열보다 더 길게 해줘야됨
		int[] newArrayInt = new int[5];

		
		//복사
		for(int i = 0; i < oldArrayInt.length; i++) {
			newArrayInt[i] = oldArrayInt[i];
		}
		
		//출력
		for(int i = 0; i < newArrayInt.length; i++) {
			System.out.println(newArrayInt[i]);
		}
	}

}
