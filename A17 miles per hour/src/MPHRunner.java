//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Micheal Ikpah
//Date - 10/20/2024
//Class - Comp science 30
//Lab  - Miles per hour

import java.util.Scanner; 
import static java.lang.System.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);

		out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();
		keyboard.close();

		MilesPerHour test = new MilesPerHour();
		test.setNums(dist, hrs, mins);
		test.calcMPH();
		test.print();
		
		//add more test cases
		
		
	}
}