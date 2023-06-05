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
        System.out.println("Hi, "+name+" -- Welcome to the Expedition prep program. Are you ready to head out into the new world?");
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
            break;
        }
    }

    public static String printPause(String message) throws InterruptedException {
        Thread.sleep(500);
        return message;
    }
}
