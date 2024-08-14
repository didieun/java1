package Chapter12;

public class EX01 {
	
	public static void main(String[] args) {
		// 예외처리 예제
		try {
			System.out.println("수행 코드 작성 영역");
		} catch (NullPointerException e) {
			System.out.println("NullPointer 예외가 발생될 경우 실행!");
		} catch (Exception e) { // 맨마지막에 모든 에러는 Exception e 에러 작성
			System.out.println("예외 발생 시 실행될 코드 작성 영역!");
		} finally {
			System.out.println("예외 여부와 관계 없이 무조건 실행!");
			System.out.println("finally 은 생략 가능");
		}
	}
}
