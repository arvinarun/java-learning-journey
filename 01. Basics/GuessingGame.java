import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int num = random.nextInt(101);
        boolean foundNumber = false;

        for(int guesses=5;guesses>0;guesses--) {
            System.out.print("Guess a number between 0 and 100: ");
            int guess = input.nextInt();
            if(guess == num) {
                System.out.println("Your guess is correct!");
                foundNumber = true;
                break;
            }
            else if(guess > num) {
                System.out.println("You guessed too high. Attempts reamaing: " + (guesses-1));
            }
            else if(guess < num) {
                System.out.println("You guessed too low. Attempts reamaing: " + (guesses-1));
            }
        }
        if (!foundNumber) {
            System.out.println("You are out of guesses. The secret number was " + num);
        }
        else {
            System.out.println("Good Game");
        }
        input.close();
    }
}