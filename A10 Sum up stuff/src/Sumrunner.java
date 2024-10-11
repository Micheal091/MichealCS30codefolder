import java.util.Scanner;
public class Sumrunner {
    public static void main(String[] args) throws Exception {
        Scanner keys =  new Scanner(System.in);
        System.out.println("Write a numer!");
        double num1 = keys.nextDouble();
        System.out.println("Write a numer!");
        double num2 = keys.nextDouble();
        Sum call = new Sum();
        call.setnums(num1, num2);
        call.Sumup();
        call.answer();

        keys.close();



    }
}
