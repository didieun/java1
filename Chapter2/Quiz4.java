package Chapter2;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		
		System.out.print("키: ");
		float height = input.nextFloat();
		
		System.out.print("몸무게: ");
		float weight = input.nextFloat();
		
		float bmi = weight / ((height * height) / 10000);
		
		System.out.println("bmi: " + bmi);
		
		input.close();
	}

}
