package patternsProgram;

public class Pattern8 {

	public static void main(String[] args) {
		//    *
		//   **
		//  ***
		// ****
		
        int n=4;
		
		
		for(int row=1;row<=n;row++) {
			
			//loop for printing " "(space) 
			
			for(int space=n-1;space>=row;space--) {
				System.out.print(" ");
			}//inner
			
			//loop for * printing
			for(int col=1;col<=row;col++) {

				System.out.print("*");
			}
			
			System.out.println();
		}
		
			
			
	}

}
