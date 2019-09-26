package miscelleneous;

public class Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	for (int i=0; i<4; i++)
	{
		for (int j=0; j<4-i;j++)
		{System.out.print(j+1);}
		for(int k=0;k<2*i;k++)
		{
			System.out.print("*");
		}
		for(int l=4;l>i; l--)
		{
			System.out.print(l-i);
		}
		System.out.println();
	}

	}

}
