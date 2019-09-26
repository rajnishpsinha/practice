package core_java;

import org.apache.commons.lang3.time.StopWatch;

class Thread1 extends Thread
{
	public void run()
	{
		Thread.currentThread().setName("first thread");
		System.out.println(Thread.currentThread().getName());
	}
}
 class Thread2 extends Thread
 {
	 public void run()
	 {
		 System.out.println("Thread2");
	 }
	 
 }

public class Threadpractice 

{
	public static void main (String[] args) throws InterruptedException
	
	{
		StopWatch mystopwatch = new StopWatch();
		mystopwatch.start();
		Thread1 th1= new Thread1();
		Thread2 th2= new Thread2();
		th1.start();
		th1.sleep(3000);
		th2.start();
		th2.sleep(4000);
		System.out.println(Thread.currentThread().getName());
		mystopwatch.stop();
		System.out.println(mystopwatch.getTime());
	}
}
