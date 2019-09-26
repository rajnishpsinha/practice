package core_java;

public abstract class Player {
	private int age;
	private String name;
	
	Player(int i, String str)
	{
		
		this.age=i;
		this.name=str;
	}
	
	abstract String gamePlays() ;
	int hasAge()
	{
		return age;
	}

}
