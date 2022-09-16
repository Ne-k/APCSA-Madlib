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

                // Ask for the user's name
                System.out.print("Your name: ");
                String userName = console.next();
                //Ask for current date
                System.out.print("Current date: ");
                String date = console.next();

                // Start asking for words for the story
                System.out.println("Enter a noun: ");
                String noun = console.next();
                System.out.println("Enter a verb: ");
                String verb = console.next();
                System.out.println("Enter an adjective: ");
                String adjective = console.next();
                System.out.println("Enter an adverb: ");
                String adverb = console.next();
                System.out.println("Enter an event: ");
                String event = console.next();
                System.out.println("Enter a place: ");
                String place = console.next();
                System.out.println("Enter a time: ");
                String time = console.next();
                System.out.println("Enter a number: ");
                int number = console.nextInt();
                System.out.println("Enter a color: ");
                String color = console.next();
                System.out.println("Enter a food: ");
                String food = console.next();
                System.out.println("Enter a drink: ");
                String drink = console.next();
                System.out.println("Enter a person's name: ");
                String personName = console.next();


                // capitalize the first letter of each word provided and override it
                userName = userName.substring(0, 1).toUpperCase() + userName.substring(1);
                date = date.substring(0, 1).toUpperCase() + date.substring(1);
                noun = noun.substring(0, 1).toUpperCase() + noun.substring(1);
                verb = verb.substring(0, 1).toUpperCase() + verb.substring(1);
                adjective = adjective.substring(0, 1).toUpperCase() + adjective.substring(1);
                adverb = adverb.substring(0, 1).toUpperCase() + adverb.substring(1);
                event = event.substring(0, 1).toUpperCase() + event.substring(1);
                place = place.substring(0, 1).toUpperCase() + place.substring(1);
                time = time.substring(0, 1).toUpperCase() + time.substring(1);
                color = color.substring(0, 1).toUpperCase() + color.substring(1);
                food = food.substring(0, 1).toUpperCase() + food.substring(1);
                drink = drink.substring(0, 1).toUpperCase() + drink.substring(1);
                personName = personName.substring(0, 1).toUpperCase() + personName.substring(1);

                //print the madlib story with all the words
                System.out.println("Here is your story:\n");
                System.out.println(personName + " went to " + place + " on " + date + " to attend " + event + ". " + userName + " was " + adjective + " and " + adverb + " " + verb + " to the event. " + userName + " was " + number + " years old and " + color + " in color. " + userName + " ate " + food + " and drank " + drink + " at the event. " + userName + " had a great time at the " + event + " and went home at " + time + ".");
            }
            case "Q" -> {
                System.out.println("You have selected to quit the game.");
                System.exit(0);
            }
            default -> System.out.println("Invalid choice!");
        }
    }


}