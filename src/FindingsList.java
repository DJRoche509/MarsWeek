import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;
//import MarsExpedition;

public class FindingsList {

    FindingsList() {}

    public static void main(String[] args) throws InterruptedException {
        MarsExpedition mExped = new MarsExpedition();
        Thread.sleep(500);

        System.out.println(mExped.printPause("Welcome back from your expedition. Time to catalog the things you found."));

        // Create an arrayList to input user's findings
        ArrayList <String> rockList = new ArrayList<String>();
        System.out.println(mExped.printPause("Downloading data ..."));

        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");

        System.out.println(mExped.printPause("Here's the list of items downloaded: \n" + rockList));

        System.out.println(mExped.printPause("Wait, there's an error. Last item is not a rock \n Let's delete that"));
        rockList.remove(-1);
        System.out.println(mExped.printPause("The correct downloaded list: \n" + rockList));
        System.out.println(mExped.printPause(" \nPerfect!" ));

        Thread.sleep(1000);

        HashMap<String, String> fossilDirectory = new HashMap<>();

        System.out.println("Fossil data downloaded");

        fossilDirectory.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossilDirectory.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossilDirectory.put("Tooth Fossil", "The tooth from an unknown fossil");

        System.out.println("Which of the fossils would you like to learn more about (Spelling and Spacing is important)?");

        Scanner input = new Scanner(System.in);

        String fossilChoice = input.nextLine();

        if (fossilChoice.equalsIgnoreCase("Bird")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Fish")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Tooth")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        }


        Thread.sleep(700);

        HashSet<String> supplies = new HashSet<>();

        supplies.add("Teleporter");
        supplies.add("Stun gun");
        supplies.add("Insta-Heal Capsules");

        supplies.remove("Stun gun");

        Iterator itr = supplies.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
