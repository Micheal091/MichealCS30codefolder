public class App {
    public static void main(String[] args) throws Exception {
       int num=3;
       while (num>0){
        System.out.println(num);
        //num = num -1; equavalent of num--
        num--;
       }
       boolean game =true;
       while (game){
        //program code/game code or calculation
        System.out.println("hello universe");

        //kill switch, play again method
        System.out.println("Do you dare to play again?");
        String userinput = "no";
        if (userinput.equals("no") || userinput.equals("No")){
            game = false; //trigger game to end
            System.out.println("game over");
        }






        //2nd practise
        //standard for loop in java
        //three conditions
        //for (where  we start; where)
        for(int i = 10; i >0; i--) {
            System.out.println("THE NUMBER IS " + i);
        }
       }

       //equivalent while
       int x = 10;
       while (x>0){
        System.out.println("the number is " + x);
        x--;
       }
    }
}
