import java.util.Scanner;
public class triangle {
    private double a,b, c, sum, s, answer;
    public double p;
    Scanner keys = new Scanner(System.in);
    public void state()
    {
        System.out.println("how long is the first side of the triangle?");
        a = keys.nextDouble();
        System.out.println("how long is the second side of the triangle?");
        b = keys.nextDouble();
        System.out.println("how long is the third side of the triangle?");
        b = keys.nextDouble();
    }

    public void perimeter()
    {
        sum = a + b + c;

    }

    public void s()
    {
        s = sum / 2;
    }

    public void area()
    {
        answer = Math.sqrt((s) *(s-a)* (s-b) *(s-c));
        answer= p;
        System.out.println("The area of the triangle is " + p);
    }


}
