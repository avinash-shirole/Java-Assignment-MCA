package patternsProgram;

public class Pattern7 {

	public static void main(String[] args) {
		//1
		//22
		//333
		
		int n= 5;
		int p=1;
		for(int row=1;row<=n;row++) {
			
			for(int col=1;col<=row;col++) {
				
				System.out.print( (p)+" ");
				
			}
			p++;
			System.out.println();
		}
	}

}
