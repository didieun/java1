package Chapter6;

public class EX15 {

	public static void main(String[] args) {
		// 배열 복사2(방법2)
		String[] oldArraystr = {"C", "JAVA", "PYTHON"};
		String[] newArraystr = new String[5];
		
		//복사
		System.arraycopy(oldArraystr, 0, newArraystr, 0, oldArraystr.length);
		
		//출력
		for(String str: newArraystr) {
			System.out.println(str);
		}

	}

}
