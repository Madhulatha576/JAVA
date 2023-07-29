package patterns;

public class pattern25 {
	    public static void main(String[] args) {
	        int numRows = 5; 
	        char currentChar = 'A';

	        for (int i = numRows; i >= 1; i--) {
	            for (int j = 1; j <= numRows - i; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= i; k++) {
	                System.out.print(currentChar + " ");
	                currentChar++;
	            }
	            System.out.println();
	        }
	    }
	}


