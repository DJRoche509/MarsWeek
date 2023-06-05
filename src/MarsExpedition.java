import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition(){
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        // Welcome and boot up message to the user.
        String [] arrMessage = {" Booting Up Now ", " 15% LOADING ", " 25% LOADING ", " 35% LOADING "," 50% LOADING "," 75% LOADING "," 95% LOADING ", " LOADED "};
        for (int i = 0; i < arrMessage.length; i++){
            System.out.println("*".repeat(10).concat( printPause(arrMessage[i])).concat("*".repeat(10))) ;
        }

        Thread.sleep(950);
        System.out.println(printPause("    WELCOME to MARS EXPEDITION !!!"));

        // Display a message to start interact with the user
        System.out.print("Please, type in your name here: ");
        // Get user's name and other inputs
        String name = input.nextLine();
        Thread.sleep(500);
        System.out.println("Hi, "+name+" -- Welcome to the Expedition program. Are you ready to head out into the new world?");
        // Get user's choice and convert it to lower case
        String choice ;

        Thread.sleep(500);
        while (true) {
            try {
                System.out.println("Type Y or N");
                choice = input.nextLine();
            } catch (InputMismatchException e) {
                String bad_input = input.next();
                System.out.println(printPause("That's not a valid answer. Try again ('Y' or 'N')."));
                continue;
            }
            // conditional statements
            if (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y")) {
                System.out.println("I knew you would say that. You are a team leader for a reason.");
            } else if (choice.equalsIgnoreCase("no") || choice.equalsIgnoreCase("n")) {
                System.out.println("Too bad you are team leader. You have to go.");
            } else {
                continue;
            }
            System.out.print(printPause("How many people would you want on your team? "));
            int peopleCount = input.nextInt();
            if (peopleCount > 2) {
                System.out.println(printPause("That's way too many people. We can only send 2 more members."));
                peopleCount = 2;
            } else if (peopleCount < 2) {
                System.out.println(printPause("That's not enough of a crew. We need you plus 2 more members."));
                peopleCount = 2;
            } else if (peopleCount == 2) {
                System.out.println(printPause("That's a perfect crew size. Good job!"));
            }

            // Ask user if he/she wants snack
            System.out.println(printPause("Now, You are allowed to bring one snack with you. What do you want to bring?"));
            String snack = input.next();
            System.out.println(printPause("Nice choice, you will be bringing a "+ snack+ " with you."));

            // Ask the user to choose a vehicle
            System.out.println(printPause("You may choose vehicles from the following options:" +
                    "\nA: A MarsWagen Tiguan" +
                    "\nB: A Lexus Expedition" +
                    "\nC: A Toyota Prado"));
            String carChoice = input.next();

            // Set conditional statements to get user's equivalent pick.
            if (carChoice.equalsIgnoreCase("A")){
                carChoice = "MarsWagen Tiguan";
            } else if (carChoice.equalsIgnoreCase("B")){
                carChoice = "Lexus Expedition";
            } else {
                carChoice = "Toyota Prado";
            }

            String [] countdown = {"Exploration team heads out in","5....","4....","3....","2....","1....","GO GO GO!"};
            // Log out user's info and possessions
            System.out.println(printPause("Okayyyy...Your expedition team is now ready" +
                    "\nLed by " + name + " with " + peopleCount + " teammates" +
                    "\nand a " + snack + " to munch on." +
                    "\n\nTo explore the surface of Mars using " + carChoice + "." ));
            for (int c =0;c < countdown.length; c++){
                System.out.println(printPause(countdown[c]));
            }
            break;
        }
    }

    public static String printPause(String message) throws InterruptedException {
        Thread.sleep(500);
        return message;
    }
}
