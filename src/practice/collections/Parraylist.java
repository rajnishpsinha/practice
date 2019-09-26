package practice.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Parraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <String> al = new ArrayList<String> ();
al.add("Rajnish");
al.add("Amit");
al.add("Ranjan");
al.add("Karan");

al.remove(0);
Iterator<String> itr= al.iterator();
 while (itr.hasNext())
	{
	/** if (itr.next()=="Amit")
	{
		itr.remove();
	} **/
	System.out.println(itr.next());
	

	}
System.out.println("Size of ArrayList is: "+al.size());
	}

}
