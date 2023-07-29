package patterns;

public class pattern18 {
		public static void main(String[] args) {
			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					if(i==2&&j==2||i==2&& j<=4 || j==2 && i<=4) {
						System.out.print("M ");
					}
					else if(i==1&& j==1|| i==1&& j==3||i==3&& j==1||i==3&&j==3) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}	
				}
				System.out.println();
			}
		}
}
