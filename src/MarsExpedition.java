import java.util.Locale;
import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition(){
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        // Welcome and boot up message to the user.
        System.out.println("********** Booting Up Now **********");
        Thread.sleep(500);
        System.out.println("********** 15 % LOADING **********");
        Thread.sleep(500);
        System.out.println("********** 25 % LOADING **********");
        Thread.sleep(500);
        System.out.println("********** 35 % LOADING **********");
        Thread.sleep(500);
        System.out.println("********** 50 % LOADING **********");
        Thread.sleep(500);
        System.out.println("********** 75 % LOADING **********");
        Thread.sleep(500);
        System.out.println("********** 95 % LOADING **********");
        Thread.sleep(500);
        System.out.println("********** LOADED **********");
        Thread.sleep(950);
        System.out.println("    WELCOME to MARS EXPEDITION !!!");

        // Display a message to start interact with the user
        System.out.print("Please, type in your name here: ");
        // Get user's name and other inputs
        String name = input.nextLine();
        Thread.sleep(500);
        System.out.print("Hi, "+name+" -- Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N");
        // Get user's choice and convert it to lower case
        String choice = input.nextLine();

        Thread.sleep(500);
        // conditional statements
        if (choice.equalsIgnoreCase( "yes") || choice.equalsIgnoreCase("y")){
            System.out.println("I knew you would say that. You are a team leader for a reason.");
        } else if (choice.equalsIgnoreCase("no") || choice.equalsIgnoreCase("n")){
            System.out.println("Too bad you are team leader. You have to go.");
        }
        Thread.sleep(500);
        System.out.print("How many people would you want on your team? ");
        int peopleCount = input.nextInt();
        Thread.sleep(500);
        if (peopleCount > 2){
            System.out.println("That's way too many people. We can only send 2 more members.");
            peopleCount = 2;
        } else if (peopleCount < 2){
            System.out.println("That's not enough of a crew. We need you plus 2 more members.");
            peopleCount = 2;
        }else if (peopleCount == 2){
            System.out.println("That's a perfect crew size. Good job!");
        }
    }
}
