
//Program name: A7 strings

//Student name: Micheal Ikpah
//Date: 9/24/2024
//Program Description: strings assignment
public class App {
    public static void main(String[] args) throws Exception {
        String message1 = "I am very happy!";
        String target1 = "very";
        System.out.println(message1.indexOf(target1));
        System.out.println(message1.indexOf(" happy"));
        System.out.println(message1.length()); 
        System.out.print(message1.substring(0,4));
        System.out.println(message1.substring(9));


        String message2 = "that was great - lol.";
        String target2 = "lol.";
        String target3 = "laugh out loud.";
        System.out.println(message2.indexOf(target2));
        System.out.println(message2.length());
        System.out.println(message2.substring(0,17) + (target3));
    }
}

