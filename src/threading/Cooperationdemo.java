package threading;
class Customer
{
	int amount = 10000;
synchronized	public void withdraw(int i)
	{
		if (amount<= i)
		{
			System.out.println("Less amount, waiting for deposit");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else 
		{
			amount-=i;
		}	
	}
synchronized public void deposit(int n)
{
	amount+=n;
	System.out.println("deposit over");
	notify();
}
	
	}

public class Cooperationdemo 
{
public static void main (String[] args)
{
	final Customer c= new Customer();
	Thread t = new Thread()
	{
		public void run() {c.withdraw(25000);}
	};
	t.start();
	new Thread(){public void run(){c.deposit(30000);}}.start();
}

}

	
	
	
		
		



