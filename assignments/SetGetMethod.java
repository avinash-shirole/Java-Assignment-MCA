package assignments;
import java.util.Scanner;
public class SetGetMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Setting data to SetGetAssignDemo class members ");

		SetGetAssignDemo sgad=new SetGetAssignDemo();
		System.out.println("Enter student ID:");
		sgad.setId(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Student Name:");
		sgad.setName(sc.nextLine());
		System.out.println("Enter Student percentage:");
		sgad.setPer(Float.parseFloat(sc.nextLine()));
		
		System.out.println("Printing All data From SetGetAssignDemo class ");
		System.out.println("Student Id: "+sgad.getId());
		System.out.println("Student Name: "+sgad.getName());
		System.out.println("Student percentage: "+sgad.getPer());
		
sc.close();
	}

}
