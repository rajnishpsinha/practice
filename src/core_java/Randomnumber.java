package core_java;

import java.util.Random;

public class Randomnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random random = new Random();
/* need numbers between 10000 &99999
 * 
 */
int roll = (random.nextInt(89999))+10000;
System.out.println(roll);
	}

}
