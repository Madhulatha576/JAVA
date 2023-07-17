package dt;
import java.util.Scanner;
public class doubleTrouble {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		int res=doubleTheNumber(num);
		System.out.println(res);
	}
	public static int doubleTheNumber(int num) {
		return num*2;
	}
}




