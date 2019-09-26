package core_java;

public class Recursion {
int getFactorial (int n)
{ int fact=1;
	if (n>1)
fact = n*getFactorial(n-1);
return fact;}
	public static void main(String[] args) {
		
Recursion rec= new Recursion();
System.out.println (rec.getFactorial(15));
	}

}
