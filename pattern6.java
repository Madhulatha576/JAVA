package patterns;
import java.util.Scanner;
public class pattern6 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int size=sc.nextInt();
	
		
		
			    for (int i = 0; i < size; i++) {
			      // print spaces
			      for (int j = 0; j < i; j++) {
			        System.out.print(" ");
			      }
			      // print stars
			      for (int j = size; j > i; j--) {
			        System.out.print("*");
			      }
			      System.out.println();
			    }
			  }
			
	
	}


		


