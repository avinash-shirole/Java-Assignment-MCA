package patternsProgram;

public class Pattern6 {

	public static void main(String[] args) {
		//A
		//BB
		//CCC
		
		int n= 4;
		int p=65;
		for(int row=1;row<=n;row++) {
			
			for(int col=1;col<=row;col++) {
				
				System.out.print( (char)(p)+" ");
				
			}
			p++;
			System.out.println();
		}
	}

}
