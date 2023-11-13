import java.util.Scanner;
import java.util.Random;

public class GuessingGame

{//class definition starts

    public static void main(String[] args) 

    {//main method definition starts

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;//declaring variable named as minRange of int datatype and intializing it with value as 1
        int maxRange = 100;//declaring variable named as maxRange of int datatype and intializing it with value as 100
        int numberToGuess = random.nextInt(maxRange-minRange+1)+minRange;//declaring variable named as numberToGuess of int datatype for generating random value from minRange to maxRange
        int numberOfAttempts = 0;//declaring variable named as numberOfAttempts of int datatype to store number of attempt attempted by user to guess correct number
        boolean hasGuessedCorrectly = false;

        System.out.println("          Welcome to the Guess the Number game!          ");
        System.out.println("_________________________________________________________");
        System.out.println("I have selected a random number between " + minRange + "to" + maxRange+". Try to guess it!");

        while (!hasGuessedCorrectly) 
        {
            System.out.print("Enter your guess: ");
            int userGuess = sc.nextInt();
            numberOfAttempts++;

            if (userGuess == numberToGuess)//checking the condition weather user has guessed correct number
            {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You guessed the number correctly in " + numberOfAttempts + " attempts.");
            } 
            else if (userGuess < numberToGuess) 
            {
                System.out.println("Too low. Try again.");
            } 
            else 
            {
                System.out.println("Too high. Try again.");
            }
        }
        sc.close();

    }//main method definition starts

}//class definition starts