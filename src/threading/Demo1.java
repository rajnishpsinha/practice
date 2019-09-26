package threading;

public class Demo1 extends Thread{
	Demo1(String str)
	{
		super();
		setName(str);
	}
	public void run()
	{
		System.out.println("thread running");
		System.out.println(this.getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo1 demothread = new Demo1 ("Ajay");
		demothread.start();
	}

}
