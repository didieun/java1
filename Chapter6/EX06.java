package Chapter6;

public class EX06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("Java is Easy");
		System.out.println("기본: " + str);
		
		// 소문자, 대문자
		System.out.println("소문자 변환: " + str.toLowerCase());
		System.out.println("대문자 변환: " + str.toUpperCase());
		
		String changeStr = new String();
		changeStr = str.replace("Easy" , "Hard");
		System.out.println("문자열 치환: " + changeStr);
		
		String[] arrStr = str.split("is");
		System.out.println("문자열 분리: " + arrStr[0] + "*"); 
		System.out.println("문자열 분리: " + "*" +  arrStr[1]);
		// * 을 입력한 이유 배열로 잘라도 공백까지 저장됨! (실행화면 보면 알수 있음)
		
		String[] arrStr2 = str.split("is");
		arrStr2[0] = arrStr[0].trim();
		arrStr2[1] = arrStr[1].trim();
		// .trim() - 앞뒤 공백 제거
		
		System.out.println("문자열 분리: " + arrStr2[0] + "*"); 
		System.out.println("문자열 분리: " + "*" +  arrStr2[1]);
	}

}
