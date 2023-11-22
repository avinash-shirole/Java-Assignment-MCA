package patternsProgram;

public class Pattern4 {

	public static void main(String[] args) {
		//1
		//12
		//123
		
		int n= 4;
		
		for(int row=1;row<=n;row++) {
			
			for(int col=1;col<=row;col++) {
				System.out.print(col +" ");
			}
			System.out.println();
		}
	}

}
