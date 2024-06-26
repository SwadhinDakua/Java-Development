import java.util.Random;
import java.util.Scanner;
public class NumberGame {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Random ran=new Random();
        boolean playagain = true;
        int roundsWon = 0;
        System.out.println("Welcome to the Number Guessing Game :");
        while(playagain)
        {
            int number = ran.nextInt(100) + 1;
            int attemptsLeft = 10;
            boolean userWon = false;
            System.out.println("/n I'm Thinking of a number betweeen 1 and 100. can you guess if :");
            System.out.println("You have " + attemptsLeft + "attempts ");
            while(attemptsLeft > 0) {
                System.out.println("Enter your guess :");
                int guess = sc.nextInt();
                if (guess < number) {
                    System.out.println("Too low!");
                } else if (guess > number) {
                    System.out.println("Too high!");

                } else {
                    System.out.println("Congratulation You guessed the number " + number + "correctly");
                    userWon = true;
                    roundsWon++;
                    break;
                }
                attemptsLeft--;
                System.out.println("You have " + attemptsLeft + "attempts");
            }
                if(!userWon)
                {
                    System.out.println("Sorry you have used all your attempts, The correct number was " + number + ".");

                }
                System.out.println("Rounds won : " + roundsWon);
                System.out.println("Do you want to play another round? (Yes/No) :");
                sc.nextLine();
                String PlayAgainInput = sc.nextLine().trim().toLowerCase();
                playagain = PlayAgainInput.equals("Yes");



        }
        System.out.println("Thank you for playing! Good bye!");
        sc.close();

    }
}
