package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int trials=6;
        String name;
        int guess;
        boolean again=true;
        System.out.println("Hello! What is your name?");
        name=input.nextLine();
        System.out.println("Nice meeting you "+name+" and welcome to...\n The Number Guessing Game!!!");
        System.out.println("I'm gonna think of a number between 1 and 20 and you'll type in your best guess as to which number I selected.");
        System.out.println("You'll have up to 6 tries before losing so here we go.");
        System.out.println("What number did I set my mind on?");
        while(again) {
            int Num_Guess = random.nextInt(20);
            int Num_Tries = 0;
            for (boolean win = false; !win && trials > Num_Tries; Num_Tries++)
            {
                guess = input.nextInt();
                if (guess == Num_Guess) {
                    win = true;
                    System.out.println("Congratulations");
                } else if (guess < Num_Guess) {
                    System.out.println("Your guess is too low");
                } else {
                    System.out.println("Your guess is too high");
                }
            }
            System.out.println("The number was " + Num_Guess);
            System.out.println("You tried guessing "+ Num_Tries + " times");
            String tryAgain;
            tryAgain = input.nextLine();
            System.out.println("Would you like to play again?"+ tryAgain);
            tryAgain=input.nextLine();

            if (tryAgain.equalsIgnoreCase("yes"))
            {
                System.out.println("Ok, let's play again.");
                System.out.println("What number did I set my mind on?");
                again = true;

            }
            else
            {
                System.out.println("Thank you for playing. Hope to see you soon");
                again = false;
            }
        }
    }
}
