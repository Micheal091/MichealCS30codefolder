import java.util.Scanner;
public class triangle {
    private double a,b, c, sum, answer;
    Scanner keys = new Scanner(System.in);
    public void state()
    {
        System.out.println("how long is the first side of the triangle?");
        a = keys.nextDouble();
        System.out.println("how long is the second side of the triangle?");
        b = keys.nextDouble();
        System.out.println("how long is the third side of the triangle?");
        c = keys.nextDouble();
    }

    public void perimeter()
    {
        sum = a + b + c;

    }

    public void area()
    {
        double s = sum / 2;
        answer = s*(s-a)*(s-b)*(s-c);
        double p = Math.round(Math.sqrt(answer));
        System.out.println("The area of the triangle is " + p);
    }

}
