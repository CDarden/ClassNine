package exercise;

public class MultiplicationMatrix {

	public static void main(String[] args) {
		//12x12// you will need two loops to run horizontally and vertically
		int n=12;
		for(int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				// to print a space between numbers use \"t". t is for tab. they are called special characters in string
				
				System.out.print(i*j + "\t");	
			}
			System.out.println("");
			
		}
		
	}

}
