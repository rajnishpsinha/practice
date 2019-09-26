package core_java;

public class String_Practice {
	
	private String name1;
	private String name2;
	String getName1()
	{return name1;}
	String getName2()
	{return name2;}
	
	public String_Practice(String str1, String str2)
	{
		this.name1= str1;
		this.name2= str2;
		
	}
	public static void main (String args[])
	{
		String_Practice sp = new String_Practice ("Ram", "Ajay");
		System.out.println((sp.name1).equals(sp.name1));
	}

}
