package com.company;
import java.util.Scanner;

public class Main {
        public static void main (String[]args)
        {
            int input_num;
            int max=2;
            int  min=1;
            int random_num = (int)Math.floor(Math.random()*(max-min+1)+min);
            Scanner input = new Scanner(System.in);
            System.out.println("You are in the land full of dragons. In front of you, you see two caves.");
            System.out.println("In one cave, the dragon is friendly and will share his treasure with you.");
            System.out.println("The other dragon is greedy and hungry and will eat you on sight.");
            System.out.println("Which cave will you go into?(1 or 2)");
            input_num= input.nextInt();
            if(input_num==random_num) {
                System.out.println("You approach the cave...");
                System.out.println("It is dark and spooky...");
                System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
                System.out.println("Gobbles you down in one bite!");
            }
            else
            {
                System.out.println("You approach the cave...");
                System.out.println("It is dark and spooky...");
                System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
                System.out.println("Presents you with a large treasure chest that was hidden under his tongue!");
                System.out.println("Congratulations! You have just become the richest man that will ever live.");

            }

        }
    }
