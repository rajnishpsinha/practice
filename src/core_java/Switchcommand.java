package core_java;

public class Switchcommand {

	public static void main(String[] args) {
		int grade=0;
	 int marks_percentage =56;
		if (marks_percentage < 33){grade=1;	}
		if 	(33<marks_percentage &&marks_percentage<75){grade = 2 ;}
		if (marks_percentage>= 75 &&  marks_percentage<=100){grade = 3 ;}
		
		switch (grade)
		{
		case 1:
		{	
				System.out.println("grade is: Fail");
			break;
		}
		
		case 2 :
		{	
		
			 System.out.println ("grade is: Pass");
		break;
		}
		
		case 3:
		{
			
				System.out.println("grade is: Excellent");
			break;
		}
		default:
		{
			System.out.println("marks_percentage should be between 0 & 100 in integer");
		}
		}
								
				
				
				
				
				
				
				
		
		
		
		
		
		
		
		
		

	}

}
