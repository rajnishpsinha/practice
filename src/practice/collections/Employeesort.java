package practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
class Employee implements Comparable<Employee>

{
	private String name;
	private int age;
	private String sex;
	public Employee(String name, int age, String sex )
	{
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	private int getAge() {
		// TODO Auto-generated method stub
		return age;
	}
	
	@Override
	public int compareTo(Employee o) {
		return (this.getAge() < o.getAge() ? -1 : 
            (this.getAge() == o.getAge() ? 0 : 1));
		
	}
@Override
public String toString()
{ 
	return ("name: "+ this.name + "age: "+ this.age + "Sex: "+this.sex);
	}
	
	
	
}

public class Employeesort {
	
	private ArrayList <Employee> emplist;
	public Employeesort(ArrayList<Employee> emplist)
	{
		this.emplist= emplist;
	}
	public  ArrayList<Employee> getEmplist()
	{
		return emplist;
	}
	public ArrayList<Employee>  sortList()
	{
		 Collections.sort( emplist);  
		 return emplist;
	}
	public static void main(String[] args) {
		Employee emp1 = new Employee("Amit",52,"male");
		Employee emp2 = new Employee("Gaytri",32,"female");
		Employee emp3 = new Employee("Rahguveer",46,"male");
		ArrayList<Employee> e_list= new ArrayList<>();
		e_list.add(emp1);
		e_list.add(emp2);
		e_list.add(emp3);
		Employeesort esort= new Employeesort(e_list);
		esort.sortList();
		Iterator<Employee> itr =e_list.iterator();
		while ( itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
