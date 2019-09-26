package miscelleneous;

import java.io.*;

public class Fileread {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileReader fir = new FileReader ("E:\\story.txt");
int i=0;
while((i=fir.read())!=-1)
{
	System.out.println((char)i);
		}
fir.close();
}
}
