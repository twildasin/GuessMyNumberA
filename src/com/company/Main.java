package com.company;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        boolean guessed = false;
        String guess = "";
        int input = 0;
        int attempts = 0;


       System.out.println("System picking a random number...\n");
       Random ran = new Random();
       int num = ran.nextInt(100) + 1;
       System.out.println("**For grading purposes the number is: " + num + " **");
       System.out.println("\nRandom number selected." + "\n" + "Begin by inputting the number you would like to guess:");

        while(guessed == false)
        {
            Scanner in = new Scanner(System.in);
            guess = in.nextLine();
            input = Integer.parseInt(guess);

            if(input == num)
            {
                guessed = true;
            }

            if(input < num)
            {
                System.out.println("The number is greater than " + input + ", please enter another number:");
            }

            if(input > num)
            {
                System.out.println("The number is less than " + input + ", please enter another number:");
            }

            attempts++;
        }

        System.out.println("Congrats! \nYou guessed the number " + num + " in " + attempts + " attemps!");

    }
}
