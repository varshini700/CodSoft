import java.util.Scanner;

public class NumberGame{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int chances=10;
        int finals=0;

        boolean playAgain=true;
        System.out.println("Welcome to the Game!");
        System.out.println("Hey you have about " + chances + " to win the game");

        while(playAgain) {
            int randnum = getrandN(1,100);
            boolean guess=false;

            for(int i=0; i<chances; i++){
                System.out.println("Chance" +(i+1)+ " Enter your guess:");
                int user = sc.nextInt();

                if(user==randnum) { 
                    guess=true;
                    finals+=1;
                    System.out.println("Great! You Won it.");
                    break;
                }
                else if (user>randnum) {
                    System.out.println("Too High");
                }
                else{
                    System.out.println("Too Low");
                }
            }

            if(guess==false) {
                System.out.println("Sorry You lost the chances. The number is " + randnum);
            }
            System.out.println("Do you want to play Again(yes/no)");
            String pA=sc.next();
            playAgain = pA.equalsIgnoreCase("yes");
        }

        System.out.println("That's it, Hope you enjoyed the Game");
        System.out.println("Here is your Score" + finals);
    }

    public static int getrandN(int min, int max) {
        return (int)(Math.random()*(max-min+1) + min);
    }
}
