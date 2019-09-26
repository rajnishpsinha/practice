package threading;

class Vehicle1 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		
	}
	}

public class Threadbasic {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle1 v1 = new Vehicle1();
		//Thread  bus= new Thread (v1);
		Thread bus = new Thread (v1,"thread1");
		bus.start();

	}

}
