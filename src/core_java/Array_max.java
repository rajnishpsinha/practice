package core_java;

public class Array_max {
int[] age;
int getMax(int[] arr)
{
	int max = arr[0];
	for (int i=1; i<arr.length; i++)
	{
		if (arr[i]<arr[i-1]){ max=arr[i-1];}
	}
	
	return max;}

public Array_max(int[] array)
{
	this.age=array;
}
	
	public static void main(String[] args) {
		Array_max am= new Array_max(new int[]{40,50,29,51,32});
		
		System.out.println(am.getMax(am.age));
		

	}

}
