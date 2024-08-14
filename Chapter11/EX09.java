package Chapter11;

//설계를 위한 문법 interface
interface TV {
	//상수같은경우는 static final 을 입력해야되고,
	// 추상메서드는 abstract 를 넣어야됨
	//interface 안에 들어가있으면 자동으로 상수, 메서드 키워드들이 들어감
	
	//상수(상수는 대문자로만)
	public int MIN_VOLUME = 0;
	public int MAX_VOLUME = 100;
	
	// 추상 메서드
	public void turnOn();
	public void turnOff();
	public void changeVolume(int volume);
	public void changeChannel(int channel);
}

class QLEDTV implements TV {
	public void turnOn() {
		System.out.println("켜다");
	}
	public void turnOff() {
		System.out.println("끄다");
	}
	public void changeVolume(int volume) {
		System.out.println(volume + "으로 볼륨을 조절하다.");
	}
	public void changeChannel(int channel) {
		System.out.println(channel + "번으로 채널을 변경하다.");
	}
}

class NEWTV implements TV {
	public void turnOn() {
		System.out.println("new TV 켜다");
	}
	public void turnOff() {
		System.out.println("new TV 끄다");
	}
	public void changeVolume(int volume) {
		System.out.println("new TV" + volume + "으로 볼륨을 조절하다.");
	}
	public void changeChannel(int channel) {
		System.out.println("new TV" + channel + "번으로 채널을 변경하다.");
	}
}

public class EX09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new QLEDTV();
		tv.turnOn();
		tv.changeChannel(9);
		tv.changeVolume(99);
		tv.turnOff();
		
		System.out.println();
		
		TV tv2 = new NEWTV();
		tv2.turnOn();
		tv2.changeChannel(9);
		tv2.changeVolume(99);
		tv2.turnOff();

	}

}
