package core_java;

public class Array_Test {
	int[] arr;
	String name;
	
	public Array_Test(int[]x, String str)
	{
	 this.arr= x;
	 this.name =str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int[]arr1= {2,3,4};
Array_Test AT= new Array_Test(new int[]{1,5,8,6},"Sanjay"); 
for (int i=0;i<(AT.arr.length); i++)
{
System.out.println(AT.arr[i]);	
}

	}

}
