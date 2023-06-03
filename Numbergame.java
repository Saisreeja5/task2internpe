import java.util.Random;
import java.util.Scanner;

public class Numbergame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String play = "yes";
        while(play.equals("yes"))
        {
           Random random = new Random();
           int randomnum = random.nextInt(100);
          
           int guess = -1;
           int tries = 0;

           while(guess != randomnum)
           {

                System.out.print("Guess a number between 1 to 100");
                guess = sc.nextInt();
                tries++;

                if(randomnum == guess)
                {
                    System.out.println(" yay!! you guessed the number");
                    System.out.println(" It took you "+ tries + "guesses");
                    System.out.print(" would you like to play again? say yes/no: ");
                    play = sc. next().toLowerCase();

                }
                else if(guess > randomnum)
                {
                    System.out.println("your guess is too high, try again");
                }
                else
                {
                    System.out.println("your guess is too low, try again");
                }
           } 
        }
        sc.close();
    }
} 
    

