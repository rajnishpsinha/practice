package string.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reversestring {
	String str;
	public String reverseString( String str)
	{
		StringBuffer stb= new StringBuffer(str);
	   return stb.reverse().toString();			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input= null;		
System.out.println("Enter the String in console hi");
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
try {
	input  =br.readLine();
	br.close();
	} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	Reversestring rvs = new Reversestring();
  System.out.print("reverse of input is: ");
   System.out.println( rvs.reverseString(input));
	}

}
