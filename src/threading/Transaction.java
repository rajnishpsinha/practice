package threading;

class Account {
int saving;
	
public Account(int saving) {
	super();
	this.saving = saving;
}

synchronized public int withdraw (int i){
if (i>saving)
{try {
	wait(200);
	System.out.println("waiting!");
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
else {saving=saving -i;
System.out.println("Saving from withdraw methos is"+saving);
}

 return saving;	
}

public int deposit(int i)
{
synchronized (this)
{
	saving = saving +i;
	System.out.println("from deposit method saving is"+ saving);
	notify();
	return saving;
}	
}
}

class Threadwithdraw implements Runnable
{	Account a;
public Threadwithdraw (Account a)
{
this.a=a;
}
	public void run() {
		a.withdraw(2000) ;		
	}	
}

class Threaddeposit implements Runnable
{
Account a;
	public Threaddeposit (Account a)
	{
		this.a= a;
	}
	public void run() {
		a.deposit(5000);		
	}
	}


public class Transaction {

	public static void main(String[] args) {
	Account a= new Account(1000);
	Threadwithdraw tw= new Threadwithdraw(a);
	Threaddeposit td= new Threaddeposit (a);
	Thread t1 = new Thread(tw);
	Thread t2 = new Thread (td);
	t1.start();
     t2.start();
	}

	

}
