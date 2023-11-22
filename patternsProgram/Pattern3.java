package patternsProgram;

public class Pattern3 {

	public static void main(String[] args) {
		//1234
		//1234
		//1234
		
		int n= 4;
		
		for(int row=1;row<=n;row++) {
			
			for(int col=1;col<=n;col++) {
				System.out.print(col +" ");
			}
			System.out.println();
		}
	}

}
