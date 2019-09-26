package threading;
class Car extends Thread
{
public void run()
{
System.out.println("max speed of car  is: "+50);	
}
}
class Bus extends Thread
{
public void run()
{
System.out.println("max speed of bus is "+40);	
}
}

public class Vehiclespeed{

	public static void main(String[] args) {
		Car car = new Car();
		Bus bus= new Bus();
		car.start();
		bus.start();

	}

}
