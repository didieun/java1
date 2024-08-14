package Chapter7;

import java.util.Scanner;

class ReseverClass{
	public int reverse(int num) {
		int tem=0, result=0;
		while(true) {
			tem = num % 10;
			num = num /10;
			result = (result + tem) * 10;
			if(num == 0) 
				return result / 10;
		}
	}
	public int inData(){
		Scanner input = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = input.nextInt();
		input.close();
		return num;
	}
	public void outData(){
		int num = inData();
		int result = reverse(num);
		System.out.println("변환 전 Data: " + num);
		System.out.println("변환 후 Data: " + result);
	}
}
public class Quiz5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReseverClass revCode = new ReseverClass();
		revCode.outData();
	}
}