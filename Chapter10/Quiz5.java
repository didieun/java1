package Chapter10;
class Car {
	private String brand;
    private String model;
    private int year;
    
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    // toString 메소드
    @Override
    public String toString() {
        return "brand : "+ brand + "\n" + "model : " + model + "\n" +"year : " + year;
    }
}
public class Quiz5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car benz = new Car("Benz", "E350d", 2024);
        System.out.println(benz);
        Car bmw = new Car("Bmw", "iX", 2024);
        System.out.println(bmw);
        Car genesis = new Car("Genesis", "G80", 2024);
        System.out.println(genesis);
        
	}
}