package patterns;
import java.util.Scanner;
public class pattern20 {
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("enter num of rows:");
	        int numRows = sc.nextInt(); 

	        printPascalsTriangle(numRows);
	    }

	    public static void printPascalsTriangle(int numRows) {
	        for (int i = 0; i < numRows; i++) {
	            int number = 1;
	            for (int j = 0; j <= i; j++) {
	                System.out.print(number + " ");
	                number = number * (i - j) / (j + 1);
	            }
	            System.out.println();
	        }
	    }
}

