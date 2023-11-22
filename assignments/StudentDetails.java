package assignments;

public class StudentDetails  {
	
	
	 String name,sportMan,rollno;

    	int sub1=0,sub2=0,sub3=0,sub4=0;
    int sportMarks;
    int total=sub1+sub2+sub3+sub4;
    float per=total/400;
    public void setData(String name,String rollno,int sportMarks,int sub1, int sub2, int sub3, int sub4) {
    	
    	this.name = name;
    	this.rollno=rollno;
    	this.sportMarks=sportMarks;
    	this.sub1 = sub1;
    	this.sub2 = sub2;
    	this.sub3 = sub3;
    	this.sub4 = sub4;
    }
	
   
    
	void getMarks() {
		System.out.println("Student Name: "+name);
		System.out.println("Student rollno: "+rollno);
		System.out.println( " Students Marks: "+sub1+" "+sub2+" "+ sub3+" "+sub4);
		
				System.out.println("\n percentage :"+per);
				System.out.println("\n sportmarks: "+sportMarks);
				System.out.println("\n After getting sportMarks percentage :"+per+2);
	}
	
}
