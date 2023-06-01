import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public GuessingGame(){
    }

    public static void main(String[] args) {
        String greet = "Howdy, what's your name?";
        // Greet the user
        System.out.println("Java Game\n"+greet);

        System.out.print("(type in your name here): ");
        // getting input from the user
        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine();

        // Create an instance of the Random object
        Random rand = new Random();
        //  Invoke method nextInt and pass in limit number value to variable numb
        int numb = rand.nextInt(100);

        // Engage with user to guess the random number
        System.out.println(name+" , I'm thinking of a number between 1 and 100.\nCan you guess that number? ");
        // Create and initialize count variable that counts user's trials
        int count = 0;
        while (true){
            int userGuess;
            try {
                System.out.print("Your guess? ");
                userGuess= Integer.parseInt(inp.nextLine());
            } catch ( InputMismatchException e){
                String bad_input = inp.next();   // need to progress past bad input
                System.out.println("That's not an integer. Try again");
                continue;
            }
            if (userGuess < 1 || userGuess > 100){
                System.out.println(userGuess + " is not a valid number, try again.");
                continue;
            }
            count ++;
            if (userGuess > numb){
                System.out.println("Your guess is too high, try again");
            }else if (userGuess < numb){
                System.out.println("Your guess is too low, try again");
            } else {
                System.out.println("Well done, "+name+"! You found my number within "+count+" attempts!");
                break;
            }
        }
    }
}
