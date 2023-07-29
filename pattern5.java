package patterns;
import java.util.Scanner;
public class pattern5 {
	public static void main(String[] args) {

		  Scanner sc=new Scanner(System.in);
		  int size=sc.nextInt();
		    
		    for (int i = 1; i <= size; i++) {
		      for (int j = 0; j < i; j++) {
		        
		        if (i != size) {
		          if (j == 0 || j == i - 1) {
		            System.out.print("*");
		          } else {
		            System.out.print(" ");
		          }
		        }
		      
		        else {
		          System.out.print("*");
		        }
		      }
		      System.out.println();
		    }
		  }
		}
	


