package core_java;

public class Methodsthread extends Thread {

	public void run ()
	{
		for (int i=0; i<=5; i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
		
	};		

	public static void main(String[] args) {
	
		Methodsthread t1 = new Methodsthread();
		Methodsthread t2= new Methodsthread();
		Methodsthread t3= new Methodsthread();
		t2.start();
		try {
			t2.join(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.start();
		System.out.println(Thread.currentThread().getName());
		try{
			t1.join(3000);
		} catch (InterruptedException e) { e.printStackTrace();}
		
		t3.start();
		

	}

}
