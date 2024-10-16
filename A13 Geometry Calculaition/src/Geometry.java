/*Program name:A13 Geometry calaculation

Student name: Micheal Ikpah

Date: 10/14/2024 */

import java.util.Scanner;
public class Geometry {

private Scanner keys = new Scanner(System.in);
private double a ;
public void pick(){
    System.out.println("Enter /'1/' to calculate the perimeter of a triangle");
    System.out.println("Enter /'2/' to calculate the surface area of a cube");
    System.out.println("Enter /'3/' to calculate the area a of a circle");
    a = keys.nextInt();
    
    if (a == 1){

        perimeter();
        }
        
        
        else if (a == 2){
          square();
        }
        
        
        else if (a == 3){
         circle();
        
        }
        else{
            
                System.out.println("Please write an appropriate digit!!!");
                System.out.println("Enter /'1/' to calculate the perimeter of a triangle");
    System.out.println("Enter /'2/' to calculate the surface area of a cube");
    System.out.println("Enter /'3/' to calculate the area a of a circle");
     a = keys.nextInt();
             
        }

}

private void perimeter() {
System.out.println("What is the length of the triangle");
double l = keys.nextInt();
System.out.println("What is the width of the triangle");
double w = keys.nextInt();
double triangle = (l * 2) + (w * 2) ;
triangle = Math.round(triangle);
System.out.println("The perimeter of the triangle is " + triangle);
}

private void square() {
    System.out.println("What is the length of the square's side");
    double s = keys.nextInt();
    double area = (s * s) *6;
    area = Math.round(area);
    System.out.println("The area of the square is " + area);
    }
private void circle(){
    System.out.println("What is the raidus of the circle");
    double c= keys.nextInt();
    c = 3.47 * (c*c);
    double areaC = Math.round(c);
    System.out.println("The area of the circle is " + areaC);

}
}
