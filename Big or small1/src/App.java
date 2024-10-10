/*
 * Program name: Big or small

Student name: Micheal Ikpah

Date:08/10/2024

Program Description: conditionals for big or small numbers
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        Bigorsmall call = new Bigorsmall();
        
        System.out.println("What is the first num to add? ");
        double firstnum = keyboard.nextDouble();
        System.out.println("What is the second num to add? ");
        double secondnum = keyboard.nextDouble();


        call.setVariables(firstnum, secondnum);
        keyboard.close();
        call.mich2();

    }
}
