package algorithm;


// to find an element in sorted array by divide n conquer
public class BinarySearch {

	public int binarySearch( int []arr, int low, int high, int  search)
	{
		
	int index=0;	
	if (low==high)
	{
		if (search==arr[low])
		  index=low;
		else 
			{index=-1;
			System.out.println("not found");
			}
		}
		

	
if ( low<high)
	
	{
		int mid = (low+high)/2;
		System.out.println("low: "+low+" high: "+high+" mid: "+mid);
		if (search>arr[mid])
		{
			low=mid+1;
		 return binarySearch( arr, low,  high, search);
		}
		else if (search<arr[mid])
		{
			high=mid-1;
			return binarySearch( arr, low, high, search);
		}
		else if (search==arr[mid])
		{
		index=mid;
			
		}
		else {
			System.out.println("element not found");
			index=-5;
		}
	}
		
		return index;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch bs= new BinarySearch();
		int[] arr= {3,6,7,9,14,25,32,45,59,78,85,92};
		System.out.println(bs.binarySearch(arr,0,11,59));
		

	}

}
