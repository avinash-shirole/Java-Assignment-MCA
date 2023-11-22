package assignments;
import java.util.Scanner;
public class InnerMethod {
	int a,b,c,d,e;
	
    void greaterFive(int a,int b,int c,int d,int e) {
    	System.out.println("Answer from greaterFive function...");
    	if(a>b && a>c && a>d && a>e) {
    		this.a=a;
        	System.out.println("If A is greater :"+ a);

    		
    	}
    	else if( b>a && b>c && b>d && b>e) {
    		this.b=b; 
        	System.out.println("If B is greater :"+ b);

    		
    	}
    	else if(c>a && c>b && c>d && c>e) {
    		this.c= c;
        	System.out.println("If C is greater :"+ c);

    	}
    	else if(d>a && d>b && d>c && d>e) {
    		this.d= d;
        	System.out.println("If D is greater :"+ d);

    	}
    	else if(e>a && e>b && e>d && e>c) {
    		this.e=e;
        	System.out.println("If E is greater :"+ e);

    	}
    	greaterFour(a,b,c,e);
	
 
    }
    void greaterFour(int a, int b , int c , int d) {
    	System.out.println("Answer from greaterFour function...");

    	if(a>b && a>c && a>d  ) {
    		this.a=a;
    		System.out.println("If A is greater :"+ a);
    	}
    	else if( b>a && b>c && b>d ) {
    		this.b= b;
    		System.out.println("If B is greater :"+ b);
    	}
    	else if(c>a && c>b && c>d ) {
    		this.c=c;
    		System.out.println("If C is greater :"+ c);
    	}
    	else if(d>a && d>b && d>c ) {
    		this.d= d;
    		System.out.println("If D is greater :"+ d);
    	}
    	greaterThree(a,b,c);

    }
    void greaterThree(int a, int b , int c ) {
    	System.out.println("Answer from greaterThree function...");

    	if(a>b && a>c ) {
    		this.a= a;
    		System.out.println("If A is greater :"+ a);
    	}
    	else if( b>a && b>c ) {
    		this.b= b;
    		System.out.println("If B is greater :"+ b);

    	}
    	else if(c>a && c>b ) {
    		this.c= c;
    		System.out.println("If C is greater :"+ c);

    	}
    	greaterTwo(a,b);
    	
    }
    void greaterTwo(int a, int b ) {
    	System.out.println("Answer from greaterTwo function...");

    	if(a>b ) {
    		this.a= a;
    		System.out.println("If A is greater :"+ a);
    	}
    	else if( b>a ) {
    		this.b= b;
    		System.out.println("If B is greater :"+ b);

    	}
    	
    }
	
    void greaterPrint(int a, int b ,int c,int d,int e) {
    	
    	greaterFive(a,b,c,d,e);
    	
    	
    	
    	
    }
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A");
		int a=sc.nextInt();
		System.out.println("Enter B");
		int b=sc.nextInt();
		System.out.println("Enter C");
		int c=sc.nextInt();
		System.out.println("Enter D");
		int d=sc.nextInt();
		System.out.println("Enter E");
		int e=sc.nextInt();
		
		 InnerMethod im= new InnerMethod();
		 im.greaterPrint(a,b,c,d,e);
	
	sc.close();}
	

}
