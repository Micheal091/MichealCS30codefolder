public class Fahrenheit {
private double a, b;
public void setcel(double set1){
    a = set1;
}
public void convert(){
   b = (a - 32)*(5/9.0);
   double c = Math.round(b);
    System.out.println("Your degree in Celsius is " + c);
}
}
