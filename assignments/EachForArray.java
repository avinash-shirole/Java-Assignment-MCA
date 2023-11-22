package assignments;
import java.util.Scanner;
public class EachForArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		
		System.out.println("Enter values in Array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Printing all Recods in Array:/ Using Each For ");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		sc.close();
	}

}
