import static java.lang.System.*;

import java.util.Scanner;

public class Input

{

  public static void main (String[] args)

  {

      Scanner keys= new Scanner(System.in);
      System.out.println("Enter an integer: ");
      int One = keys.nextInt();
      System.out.println("Enter an integer: ");
      int two = keys.nextInt();

      double done = ((double)(One));
      System.out.println("the double of your first number is "+ done);
      double dtwo = (two);
      System.out.println("the double of your second number is " + dtwo);

      double add = ( done + dtwo );
      System.out.println("The sum of " + dtwo + " and " + done + " is " + add);
      


   }

}

 