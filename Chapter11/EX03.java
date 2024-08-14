package Chapter11;

// 오버라이딩

class Ferrari2 {
	// 상속 전용으로 쓰이는 접근 제한자! protected
	protected int year;
	
	//생성자 만듬
	public Ferrari2(int year) {
		this.year = year;
	}
	// 데이터 반환 메서드
	public int getYear() {
		return year;
	}
	//메서드 호출
	public void speed() {
		System.out.println(getYear() + "년 씩 페라리 최대 속도: 300km");
	}
}

// 기존 Ferrari2 상속!
class NewFerrari extends Ferrari2 {
	
	//생성자에서는 -> 년도를 인자로 받은 super()라는 키워드 사용 -> 부모클래스에 접근할때 접근하는거 (예 -> super(year))
	public NewFerrari(int year) {
		super(year);
	}
	
	@Override // 개발자들이 Override 한지 몰라서 언어테이션(주석처리) 설정 부모클래스랑 자식클래스랑 메서드 이름이 같을경우( speed 재설정 했기때문에)
	public void speed() {
		// 부모 클래스에 접근할때 super. 라는 키워드 사용! (예 -> super.year)
		if(super.year == 2024) {
			System.out.println(getYear() + "년 씩 페라리 최대 속도: 400km");
		} else {
			super.speed();
		}
	}
}

public class EX03 {

	public static void main(String[] args) {
		// 객체1(2023)
		NewFerrari myNewCar1 = new NewFerrari(2023);
		
		// 객체2(2024)
		NewFerrari myNewCar2 = new NewFerrari(2024);
		
		//speed() 호출
		myNewCar1.speed();
		myNewCar2.speed();
	}

}
