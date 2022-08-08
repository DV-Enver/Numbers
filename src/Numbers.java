
// NUMBER GUESSING GAME

import java.util.Random;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args)
    {
        System.out.println("Let the fame begin!");
        // stores actual and guess number
        int answer, guess;

        // maximum value is 100
        final int name = 100;

        // takes input using scanner
        Scanner in = new Scanner(System.in);

        // Random instance
        Random rand = new Random();

        boolean correct = false;

        // correct answer
        answer = rand.nextInt(name) + 1;

        // loop until the guess is correct
        while (!correct) {

            System.out.println(
                    "Your numbers: ");

            // guess value
            guess = in.nextInt();

            // if guess is greater than actual
            if (guess > answer) {
                System.out.println("Your number is too big. Please, try again.");
            }

            // if guess is less than actual
            else if (guess < answer) {
                System.out.println("Your number is too small. Please, try again.");
            }

            // guess is equal to actual value
            else {

                System.out.println(
                        "Congratulations, Mr. Citizen!.");

                correct = true;
            }
        }
        System.exit(0);
    }
}

