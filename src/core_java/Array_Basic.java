package core_java;

public class Array_Basic {

	int[] arr;
	String[] arr1;
	public Array_Basic(int[]x, String[]y)
	
	{
		this.arr=x;
		this.arr1=y;
		
	}
	
	public static void main(String[] args) {
	
		Array_Basic ab1= new Array_Basic(new int[]{2,3,4},new String[]{"Ram","Shyam","Amit"});
		for ( int  i=0; i<ab1.arr1.length; i++)
		{System.out.println(ab1.arr1[i]);}
			
		//Array of array-
		
 int[][]age= new int[2][3];
 int roll_no=1;
 for (int i=0; i<2;i++)
 {
	 for (int j=0;j<3;j++)
	 {
		 age[i][j]=roll_no;
		 System.out.println(age[i][j]);
		 roll_no++;
	 }
	
 }
		
	}

}
