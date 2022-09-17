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


                System.out.println("Enter a noun: ");
                String non = console.next();
                System.out.println("Enter a verb: ");
                String vub = console.next();
                System.out.println("Enter an adjective: ");
                String amongus = console.next();
                System.out.println("Enter an adverb: ");
                String advub = console.next();
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
                String somethingYouEat = console.next();
                System.out.println("Enter a drink: ");
                String drink = console.next();
                System.out.println("Enter a person's name: ");
                String mmmmFunnyPersonsName = console.next();


                userName = userName.substring(0, 1).toUpperCase() + userName.substring(1);
                date = date.substring(0, 1).toUpperCase() + date.substring(1);
                non = non.substring(0, 1).toUpperCase() + non.substring(1);
                vub = vub.substring(0, 1).toUpperCase() + vub.substring(1);
                amongus = amongus.substring(0, 1).toUpperCase() + amongus.substring(1);
                advub = advub.substring(0, 1).toUpperCase() + advub.substring(1);
                event = event.substring(0, 1).toUpperCase() + event.substring(1);
                place = place.substring(0, 1).toUpperCase() + place.substring(1);
                time = time.substring(0, 1).toUpperCase() + time.substring(1);
                color = color.substring(0, 1).toUpperCase() + color.substring(1);
                somethingYouEat = somethingYouEat.substring(0, 1).toUpperCase() + somethingYouEat.substring(1);
                drink = drink.substring(0, 1).toUpperCase() + drink.substring(1);
                mmmmFunnyPersonsName = mmmmFunnyPersonsName.substring(0, 1).toUpperCase() + mmmmFunnyPersonsName.substring(1);


                System.out.printf("Here is your story %s - %s%n", userName, date);
                // Side note, I didn't know we could use templates so I just used an ai to randomly generate one. have fun.
                System.out.println(mmmmFunnyPersonsName + " went to " + place + " on " + date + " to attend " + event + " " + userName + " was " + amongus + " and " + advub + " " + vub + " to the event. " + userName + " was " + number + " years old and " + color + " in color. " + userName + " ate " + somethingYouEat + " and drank " + drink + " at the event. " + userName + " had a great time at the " + event + " and went home at " + time + ".");
            }
            case "Q" -> {
                System.out.println("You have selected to quit the game.");
                System.exit(0);
            }
            default -> System.out.println("Invalid choice!");
        }
    }


}