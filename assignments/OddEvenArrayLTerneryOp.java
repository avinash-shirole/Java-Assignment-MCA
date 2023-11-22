package assignments;
import java.util.Scanner;
public class OddEvenArrayLTerneryOp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//static way
//		int a[]= {2,3,4,5,6,7,8,9};
//		
//		for(int i=0;i<a.length;i++) {
//			 
//			String ans= a[i]%2==0 ? "Even":"odd";
//			System.out.println(a[i]+" is "+ ans);
//		}
		//dynamic way
		int b[] = new int[10];
		System.out.println("Enter values in array: ");
		for(int i=0;i<b.length;i++) {
			
			b[i]=sc.nextInt();
		}
		
		for(int i=0;i<b.length;i++) {
			System.out.print( b[i]+" ");
		}
		System.out.println("\nPrinting array with odd and even numbers..");
		for(int i=0;i<b.length;i++) {
			 
			
			String ans= b[i]%2==0 ? "Even":"odd";
			System.out.println("\n "+b[i]+" is "+ ans);
		}
		
		sc.close();
		
	}

}
