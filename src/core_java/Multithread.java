package core_java;

public class Multithread implements Runnable{
	@Override
	public void run() {
		System.out.println("thread from runnable");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Multithread mt1=new Multithread();
Thread t1 = new Thread (mt1);
t1.start();
System.out.println(Thread.currentThread().getName());
	}

	

}
