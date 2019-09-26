package threading;

class Pattern
{
 void displayA ()
{
for (int i=0; i<14; i++)
{  System.out.print("A ");     }
}
 void displayB ()
{
for (int i=0; i<15; i++)
{  System.out.print("B ");     }
}
void displayC ()    
{
synchronized (this) // block synchronization
{
for (int i=0; i<13; i++)
{  System.out.print("C ");     }
}
}
}
class ThreadA implements Runnable
{
Pattern p;
public ThreadA(Pattern p)
{
	this.p=p;
}
	@Override
	public void run() {
	p.displayA();
	}
	}
class ThreadB implements Runnable
{
Pattern p;
public ThreadB(Pattern p)
{
this.p=p;	
}
	@Override
	public void run() {
	p.displayB();
	}
	}
class ThreadC implements Runnable
{
Pattern p;
public ThreadC(Pattern p)
{
this.p= p;	
}
	@Override
	public void run() {
	p.displayC();
	}
	}
public class Synco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p= new Pattern();
ThreadA  a=  new ThreadA(p);
ThreadB b= new ThreadB(p);
ThreadC c= new ThreadC(p);

Thread t1= new Thread (a);
Thread t2= new Thread(b);
Thread t3= new Thread(c);

t1.start();
t2.start();
t3.start();
	}

}
