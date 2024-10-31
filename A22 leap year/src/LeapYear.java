//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Lab  -
public class LeapYear
{

    public boolean state( int year){
        if (year % 4 == 0 && year % 100 != 100){
            return true;
        }
        else {
            return false;
        }
    }
	public void isLeapYear( int year )
	{
        if (state(year)){
            System.out.println(year+" is a leap year");
        }
        else {
            System.out.println(year +" is not a leap year");
        }
	}
}