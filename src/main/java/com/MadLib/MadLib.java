package com.MadLib;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import com.MadLib.JsonHelper;
import org.json.JSONObject;


public class MadLib {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner console = new Scanner(System.in);

        // Create a menu to start the madlib game
        System.out.println("Welcome to the Mad Libs game!");
        System.out.print("I will ask you to provide various words ");
        System.out.println("and phrases to fill a story.");
        System.out.println("The full story will be printed out at the end.\n");
        System.out.println("(C)reate Madlib, (Q)uit, or do you want to hear a (J)oke?");

        String choice = console.next();
        switch (choice) {
            case "C" -> {

                System.out.println("Please enter the following to create a story:\n");


                System.out.print("Your name: ");
                String userName = console.next();

                System.out.print("Current date: ");
                int date = console.nextInt();

                System.out.println("enter a adjective: ");
                String adjective = console.next();
                System.out.println("Enter another adjective: ");
                String adjective2 = console.next();
                System.out.println("Enter a type of bird: ");
                String birdType = console.next();
                System.out.println("Enter a room in a house: ");
                String roomInHouse = console.next();
                System.out.println("Enter a verb (past tense): ");
                String verbPastTense = console.next();
                System.out.println("Enter a verb: ");
                String verb = console.next();
                System.out.println("Enter a relative's name: ");
                String relativeName = console.next();
                System.out.println("Enter a noun: ");
                String noun = console.next();
                System.out.println("Enter a liquid: ");
                String liquid = console.next();
                System.out.println("Enter a verb ending in -ing: ");
                String verbEndingInIng = console.next();
                System.out.println("Enter a part of the body (plural): ");
                String partOfBodyPlural = console.next();
                System.out.println("Enter a plural noun: ");
                String pluralNoun = console.next();

                String userNameCapitalized = userName.substring(0, 1).toUpperCase() + userName.substring(1);

                System.out.printf("Here is your story %s - %s%n", userNameCapitalized, date);

                System.out.printf("It was a %s, cold November day. I woke up to the %s smell of %s roasting in the %s downstairs. I %s down the stairs to see if I could help %s the dinner.\n My mom said, \"See if %s needs a fresh %s.\" So I carried a tray of glasses full of %s into the %s room. When I got there, I couldn't believe my %s! There were %s %s on the %s!%n", adjective, adjective2, birdType, roomInHouse, verbPastTense, relativeName, verb, noun, liquid, roomInHouse, partOfBodyPlural, pluralNoun, verbEndingInIng, roomInHouse);

            }
            case "Q" -> {
                System.out.println("You have selected to quit the game.");
                System.exit(0);
            }
            case "J" -> {
                String joke;
                JSONObject json = JsonHelper.mmmJsonYummu("https://official-joke-api.appspot.com/random_joke");
                joke = json.getString("setup") + " " + json.getString("punchline");
                System.out.println(joke + "\n-----------------------------------");

            }
            default -> System.out.println("Invalid choice!");
        }
    }
}
