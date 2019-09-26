import java.io.*;
public class Pyramidprint {
	void printPyramid()
	{
		int rows=0;
		System.out.println("Enter number of rows");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			
	
		rows =Integer.parseInt(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Rows: "+rows);
		for (int i=1; i<=rows;i++)
		{
			for(int j=1;j<=((rows*2)-1); j++)
			if ( !(((rows-i+1)<=j)&( (rows+i-1)>=j)))
				
				{System.out.print("  ");}
			/*else if (!( (rows+i-1)>=j))
					{System.out.print(" *");}*/
			else{
		System.out.print("#");
			}
		System.out.print("\n");
		
		}
	//	System.out.print("\n\r");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pyramidprint pr = new Pyramidprint();
		pr.printPyramid();
		

	}

}
