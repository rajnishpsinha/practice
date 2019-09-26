package miscelleneous;

import java.io.*;

public class Input {
	
 public static void getInput()
{
//String output=null;

try {
	int i=0;
	
	String output=null ;
	String finaloutput = null;
	String finalfinaloutput=null;
	FileReader fir= new FileReader("E:\\story.txt");
	
	 BufferedReader br = new BufferedReader (fir);
	 
	while ( (output=br.readLine()) != null)
	{
System.out.println(output);	
	}
	
	br.close();
  
  /**
   * while(( i= fir.read())!=-1)
   
  {
	  System.out.print((char)i);
  }
	*
	*/
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}}

public static void main(String[] args)
{

	Input.getInput();
}
}
