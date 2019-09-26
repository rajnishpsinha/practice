package core_java;

import java.util.Scanner;

/* This is a checked exception so we extend java.lang.Exception class
 * 
 * 
 */
 class PensionageException extends Exception{

	 PensionageException(String str)
	 {
		 super(str);
	 }
}
 
 public class Customexception
 {
	void findmonthlyPayable (int age)
	{
		if (age<60) 
		try
		{	throw  new PensionageException ("PensionageException: age is less than 60");
		}
		catch (PensionageException e)
		{
			System.out.println(e.getMessage());
		}
		else 
	System.out.println("payable monthly amount is:  "+age*100);
			
	}
	public static void main (String[]args)
	{
	System.out.println("Enter your age");
	Scanner in = new Scanner (System.in);
	int age= in.nextInt();
	Customexception cm= new Customexception();
	cm.findmonthlyPayable(age);
	}
 }
