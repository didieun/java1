package Chapter11;

class ParentClass {
	public String parent;
	public void ParentRun() {
		System.out.println("Parents class Run!");
	}
}

class ChildClass extends ParentClass {
	public String child;
	public void ChildRun() {
		System.out.println("Child class Run!");
	}
}

public class EX08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass parent = new ChildClass(); // up-casting 되면 자식클래스 접근 불가능!! 가능한 방법은 override 해주면됨
		parent.parent = "부모클래스";
		System.out.println(parent.parent);
		parent.ParentRun();
		
		System.out.println();
		
		
		// down-casting -> 무조건 up-casting이 되어야 down-casting 사용 할수있음!(강제로 하는거임)
		// -> 자식클래스명 변수명 = (자식클래스명(형변환))부모클래스변수명;
		ChildClass child = (ChildClass)parent;
		child.child = "자식클래스";
		System.out.println(child.child);
		child.ChildRun();
		
		
	}

}
