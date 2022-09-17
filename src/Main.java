
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner console = new Scanner(System.in);

        // Create a menu to start the madlib game
        System.out.println("Welcome to the Mad Libs game!");
        System.out.print("I will ask you to provide various words ");
        System.out.println("and phrases to fill a story.");
        System.out.println("The full story will be printed out at the end.\n");
        System.out.println("(C)reate Madlib, (Q)uit?");

        // Get the user's choice
        String choice = console.next();
        // Create a switch statement to handle the user's choice
        switch (choice) {
            case "C" -> {

                System.out.println("Please enter the following to create a story:\n");


                System.out.print("Your name: ");
                String userName = console.next();

                System.out.print("Current date: ");
                String date = console.next();

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
                String adjectiveCapitalized = adjective.substring(0, 1).toUpperCase() + adjective.substring(1);
                String adjective2Capitalized = adjective2.substring(0, 1).toUpperCase() + adjective2.substring(1);
                String birdTypeCapitalized = birdType.substring(0, 1).toUpperCase() + birdType.substring(1);
                String roomInHouseCapitalized = roomInHouse.substring(0, 1).toUpperCase() + roomInHouse.substring(1);
                String verbPastTenseCapitalized = verbPastTense.substring(0, 1).toUpperCase() + verbPastTense.substring(1);
                String verbCapitalized = verb.substring(0, 1).toUpperCase() + verb.substring(1);
                String relativeNameCapitalized = relativeName.substring(0, 1).toUpperCase() + relativeName.substring(1);
                String nounCapitalized = noun.substring(0, 1).toUpperCase() + noun.substring(1);
                String liquidCapitalized = liquid.substring(0, 1).toUpperCase() + liquid.substring(1);
                String verbEndingInIngCapitalized = verbEndingInIng.substring(0, 1).toUpperCase() + verbEndingInIng.substring(1);
                String partOfBodyPluralCapitalized = partOfBodyPlural.substring(0, 1).toUpperCase() + partOfBodyPlural.substring(1);
                String pluralNounCapitalized = pluralNoun.substring(0, 1).toUpperCase() + pluralNoun.substring(1);


                System.out.printf("Here is your story %s - %s%n", userName, date);

                // print the story with printf with the capitalized variables
                System.out.printf("%s: It was %s, cold November day. I woke up to the %s smell of %s roasting in the %s downstairs. I %s down the stairs to see if I could help %s the dinner. My mom said, \"See if %s needs a fresh %s.\"%n So I carried a tray of glasses full of %s into the %s room. When I got there, I couldn't believe my %s! There were %s %s on the %s!%n", userNameCapitalized, date, adjectiveCapitalized, liquidCapitalized, roomInHouseCapitalized, verbCapitalized, relativeNameCapitalized, nounCapitalized, liquidCapitalized, roomInHouseCapitalized, nounCapitalized, adjective2Capitalized, birdTypeCapitalized, nounCapitalized);
            }
            case "Q" -> {
                System.out.println("You have selected to quit the game.");
                System.exit(0);
            }
            default -> System.out.println("Invalid choice!");
        }
    }


}