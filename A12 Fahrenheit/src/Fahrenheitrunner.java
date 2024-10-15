import java.util.Scanner;
public class Fahrenheitrunner {
    public static void main(String[] args) throws Exception {
     
        Scanner keys = new Scanner(System.in);
        System.out.println("What degree of Fahrenheit would you like to convert");
        double a = keys.nextInt();
        Fahrenheit call = new Fahrenheit();
        call.setcel(a);
        call.convert();
        keys.close();
    }
}
