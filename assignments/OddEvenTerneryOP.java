package assignments;
import java.util.Scanner;
public class OddEvenTerneryOP {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter nO1:");
		int num=sc.nextInt();
		
		
		
		 String evenOdd = (num % 2 == 0) ? "even" : "odd";

	        System.out.println(num + " is " + evenOdd);
		
		
		sc.close();
	}

}
