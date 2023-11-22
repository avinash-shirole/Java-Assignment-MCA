package assignments;

import java.util.Scanner;

public class Student_marksHasAReletion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name:");
		String name= sc.nextLine();
		
		 StudentDetails ob = new StudentDetails();
		
		abc:
		while(true) {
			
			System.out.println("Enter Roll NO:");
			String rollno=sc.nextLine();
			//check rollno is valide or not
			if(rollno.length()==7) {
				
			
				System.out.println("Enter sub1: ");
				int sub1 = Integer.parseInt(sc.nextLine());
				System.out.println("Enter sub2: ");
				int sub2 = Integer.parseInt(sc.nextLine());
				System.out.println("Enter sub3: ");
				int sub3 = Integer.parseInt(sc.nextLine());
				System.out.println("Enter sub4: ");
				int sub4 = Integer.parseInt(sc.nextLine());
				
				// check marks are less than 100
				  if(sub1<=100 && sub2<=100 && sub3<=100 && sub3<=100) {
					 
						
						//check sportMan is or not
				  
					System.out.println("Enter SportMan (Yes/No): ");
					String sportMan =sc.nextLine();
					  int sportMarks=0;
					    	if(sportMan.equalsIgnoreCase("yes")) {
							
							SportMan sp= new SportMan();
							 sportMarks	= sp.getSportMarks();
							
							
						}
						else if(sportMan.equalsIgnoreCase("no")) {
							sportMarks=0;
							
						}
						else {
							System.out.println("Invalid selection..");
							System.out.println("re-select (Yes/No)");
							continue;
						}
					    	//passing data to setData() of StudentDetails class
					    	ob.setData(name, rollno,sportMarks, sub1, sub2, sub3, sub4);
							
					    	ob.getMarks();
					    	break abc;
					    	
				  }//marks condition
				  else {
					  System.out.println("Invalid marks..");
					  continue;
				
			}
		}//rollno condition
			else {
				
				System.out.println("Invalid rollno...");
				System.out.println("re-enter rollno and rollno must be 7 digit..");
				continue;
			}

			
			
			
		}//end of while
sc.close();
	}
	}

