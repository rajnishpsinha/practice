package threading;

class Demo
{

int retirement_age;
void display(int age, String name)	
{
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}   
	retirement_age= 60-age;
	
	
	System.out.println(name+" :" +"retirement age is: "+retirement_age);
	
}
}

public class Psynchronization extends Thread{
Demo employee;
String fname;
int age;
Psynchronization(Demo d, String str, int i)
{
this.employee=d;
this.fname=str;
this.age=i;
}
public void run()
{
employee.display(age,fname);	
}
	
	public static void main(String[] args) {
		Demo dm =new Demo();
		Psynchronization ps1,ps2,ps3,ps4,ps5,ps6,ps7,ps8,ps9,ps10 ;
		Psynchronization[] sync = {ps1=null,ps2=null,ps3=null,ps4=null,ps5=null,ps6=null,ps7=null,ps8=null,ps9=null,ps10=null};
		String[] nme = {"a","b","c","d","e","f","g","h","i","j"};
		int[] ag= {20,25,28,30,35,40,45,50,55,60};
		for (int t=0;t<10;t++)
		{
		 sync[t]= new Psynchronization(dm,nme[t],ag[t]);
		 sync[t].start();
		
		}

	}

}
