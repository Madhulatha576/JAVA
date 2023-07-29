package patterns;

public class pattern22 {
	    public static void main(String[] args) {
	        int numRows = 5; 
	        int cNum = 1;

	        for (int i = numRows; i >= 1; i--) {
	            for (int j = 1; j <= numRows - i; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= i; k++) {
	                System.out.print(cNum + " ");
	                cNum++;
	            }
	            System.out.println();
	        }
	    }
	}


