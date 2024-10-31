//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Micheal Ikpah
//Date - 10/20/2024
//Class - Comp science 30
//Lab  - Miles per hour

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;

	}

	public void calcMPH()
	{
		mph = (distance *60)/(((double)hours*60)+(minutes));
		mph = Math.round(mph);
	}

	public void print()
	{
System.out.println(distance+ " miles in " + hours + " hours and " + minutes + " is = " + mph + " MPH");

	}
}