import java.util.Random;
import java.util.Scanner;

public class NumberGuessing{

    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        Random rd = new Random();
        int min = 1;
        int max = 100; 
        int score = 0; 
        int round = 1;
        boolean playAgain = true;


        while (playAgain) {
            int genNumber = rd.nextInt(max - min + 1) + min;
            System.out.println("Round" + round + "Guess a number between" + min + "and" + max);

            for (int i = 1; i <= 5; i++) {
                System.out.print("Attempt" + i + ":");
                int guess = ad.nextInt();

                if (guess == genNumber) {
                    System.out.println("Congratulations You guessed the number in " + i + " attempts");
                    score += 5 - i + 1;

                    break;

                } else if (guess < genNumber) {
                    System.out.println("Too low Try again");

                } else {
                    System.out.println("Too high Try again");
                }
            }
            System.out.print("Your score is " + score + "Play again? (y/n)");
            String playAgainInput = ad.next();
            if (playAgainInput.equalsIgnoreCase("y")) {
                playAgain = false;
            }
            round++;
        }
    }
}
