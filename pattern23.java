package patterns;

public class pattern23 {
	    public static void main(String[] args) {
	        int rows = 5; 

	        printNumberPattern(rows);
	    }

	    public static void printNumberPattern(int rows) {
	        for (int i = 1; i <=rows; i++) {
	            for (int j = 1; j <=rows; j++) {
	                if (j == i) {
	                    System.out.print(i);
	                } else {
	                    System.out.print("0");
	                }
	            }
	            System.out.println();
	        }
	    }
	
	    

	}



