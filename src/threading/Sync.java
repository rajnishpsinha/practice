package threading;
class Printtable 
{
synchronized void print(int n)
{
	int i=1;
	for (i=1; i<=10; i++)
	{ try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		System.out.println(n*i);}
}
}
class First extends Thread {
	
Printtable pt;
First (Printtable p)
{	this.pt=p;}
public void run()
{	pt.print(5); }	
}
class Second extends Thread
{
Printtable pt;
Second (Printtable p)
{this.pt=p;}
public void run()
{pt.print(6);}
}
public class Sync
{
public static void main (String[]args)
{
	Printtable prt = new Printtable ();
	First fr = new First(prt);
	Second sc = new Second (prt);
	fr.start();
	sc.start();
	
}
}