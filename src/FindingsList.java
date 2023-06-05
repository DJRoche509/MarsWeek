import java.util.ArrayList;

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


    }

}
