//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Lab  -

import java.util.Scanner;

public class LeapYearRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
			System.out.print("please input a year");
			LeapYear call = new LeapYear();
			int year = keyboard.nextInt();
			call.state(year);
			call.isLeapYear(year);
			keyboard.close();
			boolean a=true;
			boolean b=false;
			System.out.println( a &&( a || b ));	
	}
}