package core_java;

public class Mergesort {
	 
	public int [] arr= new int[7];
	
	
public void mergeSort (int low, int high)
{
	 int mid;
	 if(low<high)
	 {
	  mid=(low+high)/2;
	  mergeSort (low,mid);
	  mergeSort(mid+1,high);
	  merge(low,mid,high);
	 }
	}
public void merge (int low,int  mid, int high)
{
	 int h,i,j,k;
	 int arr2 []=new int[7];
	 h=low;
	 i=low;
	 j=mid+1;

	 while((h<=mid)&&(j<=high))
	 {
	  if(arr[h]<=arr[j])
	  {
	   arr2[i]=arr[h];
	   h++;
	  }
	  else
	  {
	   arr2[i]=arr[j];
	   j++;
	  }
	  i++;
	 }
	 if(h>mid)
	 {
	  for(k=j;k<=high;k++)
	  {
	   arr2[i]=arr[k];
	   i++;
	  }
	 }
	 else
	 {
	  for(k=h;k<=mid;k++)
	  {
	   arr2[i]=arr[k];
	   i++;
	  }
	 }
	 for(k=low;k<=high;k++) arr[k]=arr2[k];
}

	public static void main(String[] args) {
	int[] array =   {24, 78,16, 81, 37,15,71}; 
	
	Mergesort mgs = new Mergesort ();
	mgs.arr = array;
	/*  for (int x=0; x< mgs.arr.length; x++)
	{System.out.println(mgs.arr[x]);}   **/
	mgs.mergeSort(0, 6);
	 for (int x=0; x< mgs.arr.length; x++)
	{
		System.out.println(mgs.arr[x]);
	}
   
	}

}
