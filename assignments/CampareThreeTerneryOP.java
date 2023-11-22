package assignments;
import java.util.Scanner;
public class CampareThreeTerneryOP {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter nO1:");
		int num1=sc.nextInt();
		System.out.println("Enter nO2:");
		int num2=sc.nextInt();
		System.out.println("Enter nO3:");
		int num3=sc.nextInt();
		int max=0,max1=0;
		
		max = (num1>num2) ? num1:num2 ;
		max1= (num1>max1) ? num1:max1 ;
		System.out.println("Greater: "+max1);
	}

}
