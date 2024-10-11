/*Program name: A10 sum up stuff

Student name: Ikpah Micheal

Date: 10/07/2024

Program Description: In this assignment I would like you to use Sum.java to create a method that you will pass parameters to the program SumRunner.java. 

You will write the code for the methods: setNums, Sum, and Print in Sum.java and instantiate the same methods in SumRunner.java. 

When you run SumRunner.java your program will add two numbers together.

  */
public class Sum {
private double a, b, c;
public void setnums( double num1, double num2 ){
a = num1;
b = num2;
}

public void Sumup() {
 double newnum = a +  b;
 c = newnum;
}
public void answer() {
    System.out.println("The sum of your numbers is............ " + c );
   }
}
