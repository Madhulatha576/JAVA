
import java.util.Scanner;
public class FinanceCalculatorApp {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter principal:");
			double principal=sc.nextDouble();
			System.out.println("time:");
			double time=sc.nextDouble();
			System.out.println("enter rate:");
			double rate=sc.nextDouble();
			FinanceCalculator finance=new FinanceCalculator();
			System.out.printf("%.2f",finance.calculateSimpleInterest(principal, rate, time));

		}

	}


