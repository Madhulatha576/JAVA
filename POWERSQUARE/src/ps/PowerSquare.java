package ps;

import java.util.Scanner;
public class PowerSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(squareNumber(num));
		

	}
	public static int squareNumber(int num) {
		return num*num;
	}
}