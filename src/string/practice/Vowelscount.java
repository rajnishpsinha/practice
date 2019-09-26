package string.practice;
import java.io.*;
public class Vowelscount {
	int countVowel()
	{
		int count=0;
		try {
			FileReader fr = new FileReader ("e:\\story.txt");
			int i;
		   
		 int[] vowel= 	new int[]{65,69,73,79,85,97,101,105,111,117};
			try {
				while (   (i =fr.read())!= -1)
				{
					for (int j: vowel){
						if (j==i)
						{
							count++;
						}
					}				
				
					//System.out.print(count);}
			}}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
		
		return count;
	}

	public static void main(String[] args) {
	
		System.out.println(new Vowelscount().countVowel());
	}

}
