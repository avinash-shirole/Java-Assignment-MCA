package patternsProgram;

public class Pattern5 {

	public static void main(String[] args) {
		//AAAA
		//BBBB
		//CCCC
		
		int n= 4;
		int p=65;
		for(int row=1;row<=n;row++) {
			
			for(int col=1;col<=n;col++) {
				
				System.out.print( (char)(p)+" ");
				
			}
			p++;
			System.out.println();
		}
	}

}
