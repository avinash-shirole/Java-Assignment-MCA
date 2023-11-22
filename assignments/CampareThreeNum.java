package assignments;
import java.util.Scanner;
public class CampareThreeNum {
 
	
	int  compare(int a, int b ,int c,int d) {
		if(a>b) {
			
			if(a>c) {
				if(a>d) {
					
					return a;
				}
				else {
					
					return d;
				}
			}//
			else {
				if(c>d) {
					
					return c;
				}
				else {
					
					return d;
				}
			}//end
		}
		else {
			if (b> c) {
				if(b>d) {
					
					return b;
					
				}
				else {
					
					return d;
				}
			}
			else {
				if( c>d) {
				
					return c;
				}
				else {
					
					return d;
				}
			}
		}//end
	}
	//assign values to compare method
   void assign(int a,int b,int c,int d) {
	     int ans= compare(a,b,c,d);
	     System.out.println(ans +" is greater amoung four..");
	 
	 }//end assign	 
   boolean isequal(int a,int b,int c,int d) {
	   if(a==b && a==c ) {
			return true;
		}
	   else {
		   assign(a, b, c, d);
		 return  false;	
	   }
   }//end isequal
   
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A: ");
		int a= sc.nextInt();
		System.out.println("Enter B: ");
		int b= sc.nextInt();
		System.out.println("Enter C: ");
		int c= sc.nextInt();
		System.out.println("Enter D: ");
		int d= sc.nextInt();
		CampareThreeNum ctn = new CampareThreeNum();
		boolean bool=ctn.isequal(a, b, c, d);
		
		if(bool) {
			System.out.println("all are equals");
		}
		
		
		
		sc.close();
	}

}
