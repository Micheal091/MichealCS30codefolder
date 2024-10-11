public class Fahrenheit {
private double a, b;
public void setcel(double set1){
    a = set1;
}
public void convert(){
    b = (a - 32)% (5/9);
}

public void call(){
    System.out.println("Your degree in Fahrenheit is " + b);
}
}
