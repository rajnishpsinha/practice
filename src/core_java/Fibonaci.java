package core_java;

public class Fibonaci {

	void printFib (int second_last_num, int last_num)
	{
		
		System.out.println(second_last_num+last_num);
		if (100> (second_last_num+last_num))
		{
			int x=last_num;
			last_num= second_last_num+last_num;
			//System.out.println("last num= "+last_num);
			second_last_num= x;
			//System.out.println("second last= "+second_last_num);
			printFib( second_last_num,  last_num);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fibonaci fn= new Fibonaci();
fn.printFib(1, 3);
	}

}
