package Chapter11;

class Ferrari1 {
	private int year;
	
	//생성자 만듬
	public Ferrari1(int year) {
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


public class EX02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ferrari1 myCar = new Ferrari1(2023);
		myCar.speed();
	}

}
