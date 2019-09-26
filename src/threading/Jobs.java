package threading;
class Workerthread extends Thread
{
public void run()
{ System.out.println("Theay are worker");}
}
class Managerthread  extends Thread
{
public void run()
{ System.out.println("They are manager");}
}

public class Jobs  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Workerthread th1= new Workerthread();
Managerthread th2= new Managerthread();
th2.start();
th1.start();
	}

}
