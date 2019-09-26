package collection.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Gameofmin {

	public int minSum(List <Integer> num, int k )
	{
		List<Integer> list= num;
		int sum=0;
		for (int i=0; i<k;i++)
		{
			Integer max= Collections.max(list);
			System.out.print("max: "+max+" ");
			Integer new_number= new Integer (max/2);
			System.out.print("new max: "+new_number+" ");
	      list.remove(max);
		 list.add(new_number);
			System.out.println("list: "+list);
		}
		for (int e:list)
			{
				sum=sum+e;
			}
		
		
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Gameofmin gom= new Gameofmin();
List<Integer> ages= new ArrayList<Integer>();
ages.add(8);
ages.add(6);
ages.add(12);
ages.add(16);
int result= gom.minSum(ages, 3);
System.out.println(result);
	}

}
